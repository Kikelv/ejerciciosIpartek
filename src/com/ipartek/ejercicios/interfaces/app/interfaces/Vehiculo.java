package com.ipartek.ejercicios.interfaces.app.interfaces;

public interface Vehiculo {

	int VEL_MAX_COCHE = 150;
	int VEL_MAX_BICI = 50;
	int VEL_MAX_PATINETE = 80;

	/**
	 * Arrancar: pondr� el atributo estaArrancado a true. Debe estar apagado para
	 * poder arrancarse
	 */
	void arrancar();

	/**
	 * Acelerar: incrementara la velocidad actual con el valor que se le pasa por
	 * par�metro sin sobrepasar el limite m�ximo de velocidad. Solo acelerara si el
	 * patinete esta encendido
	 * 
	 * @param incrementoVel
	 */
	void acelerar(int incrementoVel);

	/**
	 * Frenar: decrementara la velocidad actual con el valor que se le pasa por
	 * par�metro sin llegar a bajar de 0. Solo frenara si el patinete esta encendido
	 * 
	 * @param decrementoVel
	 */
	void frenar(int decrementoVel);

	/**
	 * Apagar: pondr� el atributo estaArrancado a false, solo si la velocidadActual
	 * es 0
	 */
	void apagar();

}
