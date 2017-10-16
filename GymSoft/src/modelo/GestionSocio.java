package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
