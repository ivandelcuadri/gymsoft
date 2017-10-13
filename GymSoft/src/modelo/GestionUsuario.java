package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import clases.Usuario;
import conectorBD.MySQLconexion;

public class GestionUsuario {
	
	public Usuario obtenerUsuario(Usuario usu){
		
		Usuario usuario=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			con= MySQLconexion.getConexion();
			String sql="select * from usuario where username=? and contraseña=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, usu.getUsername());
			pst.setString(2, usu.getContraseña());
			rs=pst.executeQuery();
			
			while(rs.next()){
				usuario= new Usuario(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			}
		} catch (Exception e) {
			System.out.println("Error en obtener datos usuario");
		}
		
		return usuario;
		
	}

}
