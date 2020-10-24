package com.ipartek.ejercicios.estructurasrepetitivas;

import java.util.Scanner;

/**
 * <h1>Ejercicio 1</h1>
 * <p>
 * Realizar un ejercicio que nos muestre la tabla de multiplicar del 6.
 * </p>
 * <i>Alternativa: que el usuario sea quien indique qué tabla quiere.</i>
 * 
 * @author Enrique Laorden
 * @version 1
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		final int TABLA_6 = 6;
		int numero;
		int resultado = 0;

		System.out.println("Tabla del " + TABLA_6);

		for (int i = 0; i <= 10; i++) {
			resultado = i * TABLA_6;
			System.out.println(i + " X " + TABLA_6 + " = " + resultado);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número de la tabla que quieres ver");
		numero = sc.nextInt();

		System.out.println("Tabla del " + numero);

		for (int i = 0; i < 11; i++) {
			resultado = i * numero;
			System.out.println(i + " X " + numero + " = " + resultado);
			System.out.println("** FIN **");
		}
		sc.close();
	}

}
