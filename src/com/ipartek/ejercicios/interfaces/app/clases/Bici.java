package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.Vehiculo;

public class Bici implements Vehiculo {

	protected static int velocidadActual = 0;
	protected static boolean estaArrancado = false;
	String estado = "";
	String parado = "";
	int decrementoVel;
	int incrementoVel;

	public Bici() {
		super();
		this.arrancar();
		this.apagar();
		this.frenar(decrementoVel);
		this.acelerar(incrementoVel);
	}

	public void arrancar() {
		estaArrancado = true;
		estado = "en marcha";
	}

	@Override
	public void acelerar(int incrementoVel) {
		if (incrementoVel > VEL_MAX_PATINETE) {
			velocidadActual = VEL_MAX_PATINETE;
		} else {

			velocidadActual = velocidadActual + incrementoVel;
		}

	}

	@Override
	public void frenar(int decrementoVel) {
		if (decrementoVel >= velocidadActual) {
			velocidadActual = 0;
			estado = "parada";
			velocidadActual = 0;
		} else {
			velocidadActual = velocidadActual - decrementoVel;
		}
	}

	@Override
	public void apagar() {
		if (estaArrancado) {
			estaArrancado = false;
			estado = "parada";
		}

	}

	@Override
	public String toString() {
		return "�Soy una bici, estoy " + estado + " y mi velocidad es de " + velocidadActual + " Km/h";
	}
// TODO crear lo mismo para bici y coche
}
