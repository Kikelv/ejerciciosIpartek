package com.ipartek.ejercicios.interfaces;

/**
 * Declaracion de la interfaz Numerico
 */
public interface INumerico {
	double EPSILON = 0.000001;

	void establecePrecision(float p);

	void estableceMaximo(float m);
}
