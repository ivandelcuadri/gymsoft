package clases;

import java.util.Date;

public class Pago {
	
	private int id_pago;
	private int id_socio;
	private Date fecha;

	public Pago() {
		
	}

	public Pago(int id_socio, Date fecha) {
		this.id_socio = id_socio;
		this.fecha = fecha;
	}

	public int getId_pago() {
		return id_pago;
	}

	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
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
