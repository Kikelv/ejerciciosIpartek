package com.ipartek.pojo;

public class TelePlana extends Televisor {

	private String pantalla;

	public TelePlana() {
		super();
		this.pantalla = "";
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public TelePlana(String nombre, float precio, int pulgadas, String pantalla) {
		super(nombre, precio, pulgadas);

		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Televisión plana: \nPantalla: " + getPantalla() + "\n" + "Pulgadas: " + getPulgadas() + "\n" + "Marca: "
				+ getNombre() + "\n" + "PVP: " + getPrecio() + " €";

	}

}
