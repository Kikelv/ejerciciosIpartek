package com.ipartek.ejercicios.abstracta;

import com.ipartek.ejercicios.abstracta.ObjetoGrafico;

public class Linea extends ObjetoGrafico {

	int longitud;

	/**
	 * Implementamos el metodo que el padre a declarado abstract
	 */
	@Override
	void dibujar() {
		System.out.println("dibujamos un alinea de longitud " + longitud);
	}

}