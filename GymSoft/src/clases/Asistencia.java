package clases;

import java.util.Date;

public class Asistencia {
	
	private int id_asistencia;
	private int id_socio;
	private Date fecha;

	public Asistencia() {
		
	}

	public Asistencia(int id_socio, Date fecha) {
		this.id_socio = id_socio;
		this.fecha = fecha;
	}

	public int getId_asistencia() {
		return id_asistencia;
	}

	public void setId_asistencia(int id_asistencia) {
		this.id_asistencia = id_asistencia;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
