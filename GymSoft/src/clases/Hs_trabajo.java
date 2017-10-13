package clases;

import java.util.Date;

public class Hs_trabajo {
	
	private int id_hs_trabajo;
	private int id_usuario;
	private Date fecha;
	private int horario_entrada;
	private int horario_salida;

	public Hs_trabajo() {
		
	}

	public Hs_trabajo(int id_usuario, Date fecha, int horario_entrada, int horario_salida) {
		this.id_usuario = id_usuario;
		this.fecha = fecha;
		this.horario_entrada = horario_entrada;
		this.horario_salida = horario_salida;
	}

	public int getId_hs_trabajo() {
		return id_hs_trabajo;
	}

	public void setId_hs_trabajo(int id_hs_trabajo) {
		this.id_hs_trabajo = id_hs_trabajo;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getHorario_entrada() {
		return horario_entrada;
	}

	public void setHorario_entrada(int horario_entrada) {
		this.horario_entrada = horario_entrada;
	}

	public int getHorario_salida() {
		return horario_salida;
	}

	public void setHorario_salida(int horario_salida) {
		this.horario_salida = horario_salida;
	}

}
