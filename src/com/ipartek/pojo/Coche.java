package com.ipartek.pojo;

public class Coche {

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private String marca;
	private String modelo;
	private float precio;
	private boolean isVendido;
	private String estado;

	// Constructor
	///////////////////////////////////////
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.precio = 0f;
		this.isVendido = false;
		this.estado = "";
	}
	// otro constructor sobrecargado

	public Coche(String marca) {
		this(); // llama al constructor por defecto, pulsar Control + click
		this.marca = marca;
	}

	public Coche(String marca, String modelo, float precio) {
		this(); // Cuidado no poner super
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	// Getters y setters
	///////////////////////////////////////

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isVendido() {
		return isVendido;
	}

	public void setVendido(boolean isVendido) {
		this.isVendido = isVendido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", isVendido=" + isVendido
				+ ", estado=" + estado + "]";
	}

}
