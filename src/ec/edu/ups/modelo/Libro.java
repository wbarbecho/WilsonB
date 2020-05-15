package ec.edu.ups.modelo;

import java.io.Serializable;

public abstract class Libro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String titulo;
	private String Autor;
	private String edicion;
	private String Imagen;
	private double precio;

	public Libro(String isbn, String titulo, String autor, String edicion, String imagen, double precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		Autor = autor;
		this.edicion = edicion;
		Imagen = imagen;
		this.precio = precio;
	}

	public void calcularPrecio() {
		System.out.println("Comision: " + calcularComision());
		System.out.println("PrecioFijo: " + calcularPrecioFijo());
	}

	public abstract double calcularPrecioFijo();

	public abstract double calcularComision();

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", Autor=" + Autor + ", edicion=" + edicion + ", Imagen="
				+ Imagen + ", precio=" + precio + "]";
	}

}
