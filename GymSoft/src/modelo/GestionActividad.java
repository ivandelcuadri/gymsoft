package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Actividad;
import conectorBD.MySQLconexion;

public class GestionActividad {
	
	public List<Actividad> obtenerActividades(){   //tambien probe con ArrayList<Actividad> 
		List<Actividad> actividades = new ArrayList<Actividad>();
		Actividad actividad = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "SELECT * FROM actividad";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			try{
				while(rs.next()){
					actividad = new Actividad(rs.getString(2));
					actividad.setId_actividad(rs.getInt(1));
					actividades.add(actividad);
				}
			}catch (Exception e) {
				System.out.println("Error recuperar actividades");
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener las actividades");
		}
		return actividades;
	}
	
	public int obtenerID(String actividad){
		//Actividad act=null;
		int id=0;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "SELECT * FROM actividad where descripcion = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, actividad);
			rs = pst.executeQuery();
			while(rs.next()){
				// act = new Actividad (rs.getString(2));
				id= rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("Error en obtener ID actividad");
		}
		//return act.getId_actividad();
		return id;
	}
	
	public void guardarActividad(Actividad act){
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "insert into Actividad (descripcion) values (?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, act.getDescripcion());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error en guardar actividad");
		}
	}
	
	public Actividad obtenerActividad(Actividad act){
		Actividad actividad = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "select * from actividad where descripcion=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, act.getDescripcion());
			rs = pst.executeQuery();
			while(rs.next()){
				actividad= new Actividad(rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println("Error en obtener datos de la actividad");
		}
		return actividad;
	}

}
