package com.ipartek;

import java.util.Scanner;

/**
 * Pedir un número hasta que introduzca un 5
 * 
 * @author Enrique Laorden
 * @version 1
 */
public class pedirNumeroHasta5 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		boolean cumple = false; // inicio en false para que cuando cumpla la concición pase a true

		int numero; // aquí se guarda lo que escribe el usuario

		System.out.println("Introduce un 5"); // esto lo pongo fuera del while para que no se repita

		while (!cumple) {
			// el try es cuando el usuario mete un numero (int), si pone otra cosa pasa al
			// catch y se repregunta
			try {
				numero = sn.nextInt(); // esto debe estar fuera del if

				if (numero == 5) {
					cumple = true;
					System.out.println("Perfecto, eres un crack");
				} else {
					System.out.printf("Sigue intentándolo, has metido un %s", numero); // aquí meto la variable con
																						// printf y %
				}

			} catch (Exception e) { // esto sería un fallo genérico, hay que ver qué excepciones da
				System.out.println("Debe ser un número");
				sn.next();
			}
		}

	}
}
