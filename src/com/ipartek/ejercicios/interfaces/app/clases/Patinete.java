package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.Vehiculo;

public class Patinete implements Vehiculo {

	protected static int velocidadActual = 0;
	protected static boolean estaArrancado = false;
	String estado = "";
	String parado = "";

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
			estado = "parado";
		} else {
			velocidadActual = velocidadActual - decrementoVel;
		}
	}

	@Override
	public void apagar() {
		if (estaArrancado) {
			estaArrancado = false;
			estado = "parado";
		}

	}

	@Override
	public String toString() {
		return "“Soy un patinete, estoy " + estado + " y mi velocidad es de " + velocidadActual + " Km/h";
	}
// TODO crear lo mismo para bici y coche
}
