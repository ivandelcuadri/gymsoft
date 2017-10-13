package clases;

import java.util.Date;

public class Asistencia {
	
	private int id_asistencia;
	private int id_socio;
	private Date fecha_asistencia;

	public Asistencia() {
		
	}

	public Asistencia(int id_socio, Date fecha_asistencia) {
		this.id_socio = id_socio;
		this.fecha_asistencia = fecha_asistencia;
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

	public Date getFecha_asistencia() {
		return fecha_asistencia;
	}

	public void setFecha_asistencia(Date fecha_asistencia) {
		this.fecha_asistencia = fecha_asistencia;
	}

}
