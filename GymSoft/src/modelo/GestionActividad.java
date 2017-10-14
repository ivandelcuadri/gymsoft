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

}
