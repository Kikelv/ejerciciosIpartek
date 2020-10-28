package com.ipartek.ejercicios.interfaces;

/**
 * Declaracion de la clase Acumulador
 */
public class Acumulador implements IModificacion {
	private int valor;

	public Acumulador(int i) {
		this.valor = i;
	}

	public int daValor() {
		return this.valor;
	}

	public void incremento(int a) {
		this.valor += a;
	}
}
