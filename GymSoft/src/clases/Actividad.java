package clases;

public class Actividad {

	private int id_actividad;
	private String descripcion;
	
	public Actividad() {
		
	}

	public Actividad(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return this.getDescripcion();
	}

}
