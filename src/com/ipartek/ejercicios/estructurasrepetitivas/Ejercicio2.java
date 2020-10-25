package com.ipartek.ejercicios.estructurasrepetitivas;

/**
 * <h1>Ejercicio 2</h1>
 * 
 * <p>
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 * </p>
 * 
 * @author Enrique Laorden
 * @version 1
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("** TABLAS DE MULTIPLICAR ** \n");
		int resultado = 0;

		for (int t = 0; t < 11; t++) {

			System.out.println("");

			for (int i = 0; i <= 10; i++) {

				resultado = i * t;
				System.out.println(i + " * " + t + " = " + resultado);
			}

		}

	}

}
