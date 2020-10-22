package com.ipartek.actividades;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ol>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ol>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado.
 * 
 * @author Enrique Laorden
 * 
 * @version 1
 */
public class EjercicioPractico1B {

	static Scanner sc = null;

	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static double centimetros = 0;
	static double pulgadas = centimetros / 2.54; // Cálculo de pulgadas;
	static final private String OPCION_DNI = "1";
	static final private String OPCION_PULGADAS = "2";
	static final private String OPCION_SALIR = "3";

	public static void main(String[] args) throws Exception {

		menuPrincipal();

		do {

			opciones();

		} while (!OPCION_SALIR.equals(opcion));

		System.out.println("-------------------------------------");
		System.out.println("<<<< FIN DEL EJERCICIO   >>>>");
		sc.close();

	} // fin main

	// \/\/ MÉTODOS \/\/

	private static void opciones() throws Exception {
		switch (opcion) {

		case OPCION_DNI:

			System.out.println("Escribe los números de tu DNI");
			String numeros = sc.nextLine();
			try {
				String dniCompleto = Utilidades.calcularLetraDni(numeros);
				System.out.println("Es: " + dniCompleto + "\n");
				menuPrincipal();
			} catch (Exception e) {
				System.out.println("DNI no válido");
			}

			break;

		case OPCION_PULGADAS:

			System.out.println("Escribe los centímetros para pasarlos a pulgadas");
			System.out.println("");

			centimetros = sc.nextDouble();
			System.err.println(centimetros + "cm equivalen a " + centimetros / 2.53 + " pulgadas\n");

			opcion = sc.nextLine();
			menuPrincipal();

			break;

		case OPCION_SALIR: // SALIR DE LA APP

			System.out.println("Vuelve pronto");

			break;

		default:
			System.out.println("");
			System.out.println("** Escribe una opción del menú, por favor. **\n");
			// menuPrincipal();
			opcion = sc.nextLine();
			break;
		}

	}

	private static void menuPrincipal() {
		sc = new Scanner(System.in);
		System.out.println("***************  MENÚ  ***************");
		System.out.println("");
		System.out.println(OPCION_DNI + ") Calcular DNI");
		System.out.println(OPCION_PULGADAS + ") Pasar de cm a pulgadas");
		System.out.println(OPCION_SALIR + ") Salir del menú");
		System.out.println("");
		System.out.println("**************************************");
		System.out.println("\n Selecciona una opción del menu:");
		opcion = sc.nextLine();

	}

} // fin class
