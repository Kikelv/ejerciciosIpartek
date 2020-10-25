package com.ipartek.ejercicios.estructurasrepetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Ejercicio 3</h1>
 * <p>
 * Realizar el siguiente men�:
 * </p>
 * <p>
 * Introduzca una opci�n:
 * </p>
 * <ol>
 * <li>Calcular el �rea de un cuadrado</li>
 * <li>Calcular el �rea de un tri�ngulo equil�tero</li>
 * <li>Calcular el per�metro de un circulo</li>
 * <li>Calcular el �rea de un circulo</li>
 * </ol>
 * <p>
 * Hacer que se repita este men� de manera indefinida.
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
				System.out.println("Calcular �rea del cuadrado, inserta la medida en cent�metros:");
				int datos = 0;

				try {
					datos = sc.nextInt();
					int resul = datos * datos;
					System.out.println("El resultado es: " + resul + "cm2\n");

				} catch (Exception e) {
					System.out.println("�Cuidado! Solo puedes insertar n�meros. \n");
					sc.next();
				}

				continuar();
				break;
			case OPCION_AREA_TRIANGULO:
				// System.out.println("Calcular �rea del cuadrado, inserta la medida en
				// cent�metros:");
				datos = sc.nextInt();

				do {
					try {
						datos = sc.nextInt();

					} catch (InputMismatchException ime) {
						System.out.println("�Cuidado! Solo puedes insertar n�meros. ");
						sc.next();
					}
				} while (datos != 0);

				break;
			default:
				System.out.println("** Elige una opci�n existente **\n");
				break;
			}
			// sc.close();
		} while (salir == false);
	}

	private static void menu() {
		System.out.println("Introduzca una opci�n:\n");
		System.out.println(OPCION_AREA_CUADRADO + ") Calcular el �rea de un cuadrado");
		System.out.println(OPCION_AREA_TRIANGULO + ") Calcular el �rea de un tri�ngulo equil�tero");
		System.out.println(OPCION_PERIMETRO_CIRCULO + ") Calcular el per�metro de un circulo");
		System.out.println(OPCION_AREA_CIRCULO + ") Calcular el �rea de un circulo\n");
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
