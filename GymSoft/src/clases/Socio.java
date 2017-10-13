package clases;

import java.util.Date;

public class Socio {
	
	private int id_socio;
	private String nombre;
	private String apellido;
	private int dni;
	private Date fecha_nacimiento;
	private Date fecha_ingreso;
	
	public Socio() {
		
	}

	public Socio(String nombre, String apellido, int dni, Date fecha_nacimiento, Date fecha_ingreso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_ingreso = fecha_ingreso;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

}
