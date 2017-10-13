package clases;

import java.util.Date;

public class Pago {
	
	private int id_pago;
	private int id_socio;
	private Date fecha_pago;

	public Pago() {
		
	}

	public Pago(int id_socio, Date fecha_pago) {
		this.id_socio = id_socio;
		this.fecha_pago = fecha_pago;
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

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

}
