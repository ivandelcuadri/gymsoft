package clases;

public class Usuario {

	private int id_usuario;
	private String nombre;
	private String apellido;
	private String dni;
	private String contrasenia;
	private int tipo_usuario;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String apellido, String dni, String contrasenia, int tipo_usuario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.contrasenia = contrasenia;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

}
