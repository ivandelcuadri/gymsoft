package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Actividad;
import conectorBD.MySQLconexion;

public class GestionActividad {
	
	public ArrayList<String> obtenerActividades(){   //tambien probe con ArrayList<Actividad> 
		ArrayList<String> actividades = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLconexion.getConexion();
			String sql = "SELECT * FROM actividad";  //no puede ser que no ande esto facil.
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			try{
				while(rs.next()){
					actividades.add( rs.getString(1)); // probe con getString(2), getSTring("descripcion") , actividades.add(new Actividad(rs.getString(2)))
				}
			}catch (Exception e) {
				System.out.println("Error recuperar actividades");   // salta siempre esta exepcion 
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener las actividades");
		}
		return actividades;
	}

}
