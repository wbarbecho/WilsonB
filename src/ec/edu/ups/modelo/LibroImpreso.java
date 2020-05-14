package ec.edu.ups.modelo;

import java.io.Serializable;

public class LibroImpreso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Libro Libro;
	private String id;
	private double comision;
	private double costoEnvio;

	public LibroImpreso(Libro libro, String id, double comision, double costoEnvio) {
		super();
		Libro = libro;
		this.id = id;
		this.comision = comision;
		this.costoEnvio = costoEnvio;
	}

	public Libro getLibro() {
		return Libro;
	}

	public void setLibro(Libro libro) {
		Libro = libro;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public double getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(double costoEnvio) {
		this.costoEnvio = costoEnvio;
	}

	@Override
	public String toString() {
		return "LibroImpreso [Libro=" + Libro + ", id=" + id + ", comision=" + comision + ", costoEnvio=" + costoEnvio
				+ "]";
	}

}
