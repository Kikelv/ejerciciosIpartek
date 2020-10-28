package com.ipartek.ejercicios.interfaces.app.interfaces;

public interface Vehiculo {

	int VEL_MAX_COCHE = 150;
	int VEL_MAX_BICI = 50;
	int VEL_MAX_PATINETE = 80;

	void arrancar();

	void acelerar(int incrementoVel);

	void frenar(int decrementoVel);

	void apagar();

}
