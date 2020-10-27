package com.ipartek.pojo;

/**
 * lista se guardaran objetos de la clase Jugador, que tendrá los atributos
 * nombre, de tipo Sting y dorsal de tipo int.
 * 
 * @author Admin
 *
 */
public class Futbolista {

	private String nombre = "";
	private int dorsal;

	public Futbolista(String nombre, int dorsal) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public String toString() {
		return nombre + " lleva el dorsal " + dorsal;
	}
}
