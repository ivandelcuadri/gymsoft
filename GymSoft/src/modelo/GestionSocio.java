package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Actividad;
import clases.Socio;
import conectorBD.MySQLconexion;

public class GestionSocio {
	
	public Socio obtenerSocio(Socio soc){
		Socio socio = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "select * from socio where dni=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, soc.getDni());
			rs = pst.executeQuery();
			while(rs.next()){
				socio= new Socio(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6));
			}
		} catch (Exception e) {
			System.out.println("Error en obtener datos de socio");
		}
		return socio;
	}

	public void guardarSocio(Socio soc) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "insert into socio (nombre, apellido, dni, fecha_nacimiento, fecha_ingreso) values (?, ?, ?, ?, ?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, soc.getNombre());
			pst.setString(2, soc.getApellido());
			pst.setString(3, soc.getDni());
			pst.setDate(4, new java.sql.Date(soc.getFecha_nacimiento().getTime()));
			pst.setDate(5, new java.sql.Date(soc.getFecha_ingreso().getTime()));
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error en guardar socio");
		}
	}
	
	public void guardarActividad(int idSocio, int idActividad){
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = MySQLconexion.getConexion();
			String sql="insert into socio_actividad (id_socio, id_actividad) values (?, ?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1,idSocio);
			pst.setInt(2, idActividad);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error en guardar actividadSocio");
		}
	}
	
	public int obtenerID(Socio soc){
		//Socio socio = null;
		int id=0;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "select * from socio where dni=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, soc.getDni());
			rs = pst.executeQuery();
			while(rs.next()){
				//socio= new Socio(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6));
				id=rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("Error en obtener ID de socio");
		}
		//return socio.getId_socio();
		return id;
	}
	
	public List<Socio> obtenerSocios(){ 
		List<Socio> socios = new ArrayList<Socio>();
		Socio socio = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "SELECT * FROM socio";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			try{
				while(rs.next()){
					socio = new Socio(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6));
					socio.setId_socio(rs.getInt(1));
					socios.add(socio);
				}
			}catch (Exception e) {
				System.out.println("Error recuperar socios");
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener las socios");
		}
		return socios;
	}

	public List<Actividad> obtenerActividadesDe(int id_socio) {
		List<Actividad> actividades = new ArrayList<Actividad>();
		Actividad actividad = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "SELECT * FROM actividad a INNER JOIN socio_actividad s ON a.id_actividad = s.id_actividad WHERE id_socio=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, id_socio);
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
	
}
