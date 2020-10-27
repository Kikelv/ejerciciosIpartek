package com.ipartek.pojo;

public class Electrodomestico {

	protected String nombre;
	protected float precio;

	public Electrodomestico() {
		super();
		this.nombre = ("");
		this.precio = (0f);
	}

	public Electrodomestico(String nombre, float precio) {
		this();
		this.nombre = (nombre);
		this.precio = (precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
