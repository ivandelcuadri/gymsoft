package clases;

public class TipoUsuario {

	private int id_tipo;
	private String descripcion;
	
	public TipoUsuario() {
		
	}

	public TipoUsuario(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
