package com.ipartek.actividades.actividad3.pojo;

public class Libro {

	private int id;
	private String nombre;
	private int paginas;

	public Libro(int id, String nombre, int paginas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.paginas = paginas;
	}

	public Libro(String nombre, int paginas) {
		super();
		this.nombre = nombre;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return id + ") " + nombre + ", número de páginas: " + paginas;
	}

}
