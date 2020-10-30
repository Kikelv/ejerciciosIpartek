package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.Vehiculo;

public class Patinete implements Vehiculo, AutoCloseable {

	protected static int velocidadActual = 0;
	protected static boolean estaArrancado = false;
	String estado = "";
	String parado = "";
	int decrementoVel;
	int incrementoVel;
	int velocidad;

	/*
	 * public Patinete() { super(); this.arrancar(); this.apagar();
	 * this.frenar(decrementoVel); this.acelerar(incrementoVel); }
	 */
	public void arrancar() {
		if (estaArrancado || velocidadActual > 0) {
			System.out.println("** YA ESTABA ARRANCADO");
		} else {
			System.out.println("** ON");
			estaArrancado = true;
			estado = "en marcha";
		}
	}

	@Override
	public void acelerar(int incrementoVel) {

		velocidadActual += incrementoVel;

		if (velocidadActual > VEL_MAX_PATINETE) {
			velocidadActual = VEL_MAX_PATINETE;
			velocidad = VEL_MAX_PATINETE;
		} else {
			velocidad = velocidadActual;
		}

	}

	@Override
	public void frenar(int decrementoVel) {
		if (decrementoVel >= velocidadActual) {
			velocidad = 0;
			estado = "parado";

		} else {
			velocidad = velocidadActual - decrementoVel;
		}
	}

	@Override
	public void apagar() {
		if (velocidad == 0) {
			estaArrancado = false;
			estado = "apagado";
			velocidadActual = 0;
			System.out.println(" ** OFF");
		}
		if (velocidad > 0) {
			System.out.println(" ** No se puede apagar estando en movimiento \n");

		}

	}

	@Override
	public String toString() {

		return "“Soy un patinete, estoy " + estado + " y mi velocidad es de " + velocidad + " Km/h";
	}
// TODO crear lo mismo para bici y coche

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}
}
