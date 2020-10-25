package com.ipartek.ejercicios.estructurasrepetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Ejercicio 3</h1>
 * <p>
 * Realizar el siguiente menú:
 * </p>
 * <p>
 * Introduzca una opción:
 * </p>
 * <ol>
 * <li>Calcular el área de un cuadrado</li>
 * <li>Calcular el área de un triángulo equilátero</li>
 * <li>Calcular el perímetro de un circulo</li>
 * <li>Calcular el área de un circulo</li>
 * </ol>
 * <p>
 * Hacer que se repita este menú de manera indefinida.
 * </p>
 * 
 * @author Enrique Laorden
 * @version 1
 */
public class Ejercicio3 {

	static final private String OPCION_AREA_CUADRADO = "a";
	static final private String OPCION_AREA_TRIANGULO = "b";
	static final private String OPCION_PERIMETRO_CIRCULO = "c";
	static final private String OPCION_AREA_CIRCULO = "d";
	static boolean salir = false;
	static Scanner sc = new Scanner(System.in);
	static String opcion = "";

	public static void main(String[] args) {

		do {
			menu();

			switch (opcion) {

			case OPCION_AREA_CUADRADO:
				System.out.println("Calcular área del cuadrado, inserta la medida en centímetros:");
				int datos = 0;

				try {
					datos = sc.nextInt();
					int resul = datos * datos;
					System.out.println("El resultado es: " + resul + "cm2\n");

				} catch (Exception e) {
					System.out.println("¡Cuidado! Solo puedes insertar números. \n");
					sc.next();
				}

				continuar();
				break;
			case OPCION_AREA_TRIANGULO:
				// System.out.println("Calcular área del cuadrado, inserta la medida en
				// centímetros:");
				datos = sc.nextInt();

				do {
					try {
						datos = sc.nextInt();

					} catch (InputMismatchException ime) {
						System.out.println("¡Cuidado! Solo puedes insertar números. ");
						sc.next();
					}
				} while (datos != 0);

				break;
			default:
				System.out.println("** Elige una opción existente **\n");
				break;
			}
			// sc.close();
		} while (salir == false);
	}

	private static void menu() {
		System.out.println("Introduzca una opción:\n");
		System.out.println(OPCION_AREA_CUADRADO + ") Calcular el área de un cuadrado");
		System.out.println(OPCION_AREA_TRIANGULO + ") Calcular el área de un triángulo equilátero");
		System.out.println(OPCION_PERIMETRO_CIRCULO + ") Calcular el perímetro de un circulo");
		System.out.println(OPCION_AREA_CIRCULO + ") Calcular el área de un circulo\n");
		opcion = sc.nextLine();
	}

	private static void continuar() {
		System.out.println("Desea continuar?");
		Scanner sc = new Scanner(System.in);
		String respuesta = sc.nextLine();
		if (respuesta.equals("si")) {
			menu();
		} else if (respuesta.equals("no")) {
			System.out.println("** FIN **");
			salir = true;
		}
	}

}
