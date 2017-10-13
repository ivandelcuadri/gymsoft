package conectorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLconexion {

	public static Connection getConexion(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost/gymsoft";
			String usuario="root";
			String contraseña="";
			con = DriverManager.getConnection(url, usuario, contraseña);
		} catch (ClassNotFoundException e) {
			System.out.println("Error --> al cargar Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error --> al conectar BD");
			e.printStackTrace();
		}
		
		return con;
		
	}
}
