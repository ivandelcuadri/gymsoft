package clases;

public class Usuario {

	private int id_usuario;
	private String nombre;
	private String apellido;
	private int dni;
	private String username;
	private String contrase�a;
	private int tipo_usuario;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String apellido, int dni, String username, String contrase�a, int tipo_usuario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.username = username;
		this.contrase�a = contrase�a;
		this.tipo_usuario = tipo_usuario;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

}
