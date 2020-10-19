package com.ipartek.pojo;

public class Persona {

	final static int EDAD_MINIMA = 0;
	final static int EDAD_MAXIMA = 120;

	private String nombre;
	private int edad;

	// Constructor
	///////////////////////////////////////
	public Persona() {
		super();
		this.nombre = "Sin nombre";
		this.edad = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		try {

			if (edad > 0 && edad < 120) {
				this.edad = edad;
			}

		} catch (Exception e) {
			// if (edad < 0) {
			// this.edad = 5;
			// }
			if (edad > 120) {
				this.edad = EDAD_MAXIMA;
			}
			System.out.println("entre 0 y 120");
		}

	}

}
