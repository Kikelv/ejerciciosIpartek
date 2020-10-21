package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Coche;

/**
 * <h1>App para CRUD de Coches</h1>
 * <p>
 * El ejercicio consiste en crear un menú para un concesionario de coches en el
 * que haremos lo siguiente:
 * </p>
 * <ol>
 * <li>Listar los coches</li>
 * <li>Crear nuevos coches</li>
 * <li>Modificar coches</li>
 * <li>Vender coches</li>
 * <li>Salir del menú</li>
 * <li>Demás opciones que se nos ocurra</li>
 * </ol>
 * 
 * @author Enrique Laorden
 *
 */
public class Concesionario {

	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Coche> coches = new ArrayList<Coche>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	private static final String OPCION_VER = "1";
	private static final String OPCION_INSERTAR = "2";
	private static final String OPCION_SALIR = "s";

	public static void main(String[] args) {

		System.out.println("<<<<<<<  APP  CONCESIONARIO   >>>>>>>");
		System.out.println("-------------------------------------");
		sc = new Scanner(System.in);

		incializarDatos();
		menuPrincipal();

		do {

			opciones();

		} while (!OPCION_SALIR.equals(opcion));

		System.out.println("-------------------------------------");
		System.out.println("<<<< CIERRE APP  CONCESIONARIO   >>>>");
		sc.close();

	}// Main

	// \/\/ MÉTODOS \/\/

	private static void incializarDatos() {
		coches.add(new Coche("Ford", "Fiesta", 8000));
		coches.add(new Coche("Kia", "Ceed", 15000));
		coches.add(new Coche("Opel", "Astra", 16000));
		coches.add(new Coche("Audi", "A4", 25000));
	}

	private static void opciones() {

		switch (opcion) {

		case OPCION_VER: // MOSTRAR LOS COCHES DISPONIBLES
			System.out.println("");
			System.out.println("STOCK DE COCHES DISPONIBLES:\n");
			for (Coche c : coches) {
				System.out.println("");
				System.out.println(c);
			}
			System.out.println("\n");
			menuPrincipal();
			System.out.println("");
			break;

		case OPCION_INSERTAR: // AÑADIR UN NUEVO COCHE
			System.out.println("AÑADIR");
			nuevoCoche();
			System.out.println("");
			System.out.println("\\\\/\\\\/ SE HA AÑADIDO TU COCHE AL STOCK \\\\/\\\\/");
			System.out.println("");

			for (Coche c : coches) {
				System.out.println(c);
			}
			System.out.println("");
			menuPrincipal();
			break;
		/*
		 * case OPCION_SALIR: // SALIR DE LA APP
		 * 
		 * System.out.println("Vuelve pronto"); break;
		 */
		default:
			System.out.println("");
			System.out.println("** Escribe una opción del menú, por favor. **\n");
			// menuPrincipal();
			opcion = sc.nextLine();
			break;
		}

	}

	private static void nuevoCoche() {

		System.out.println("Escribe la marca del coche");
		String marca = sc.nextLine();

		System.out.println("Escribe el modelo del coche");
		String modelo = sc.nextLine();

		coches.add(new Coche(marca, modelo, 0));
	}

	private static void menuPrincipal() {
		System.out.println("***************  MENÚ  ***************");
		System.out.println("");
		System.out.println("1) Ver coches disponibles");
		System.out.println("2) Insertar nuevo coche");
		System.out.println("3) Modificar coche existente");
		System.out.println("4) Vender coche");
		System.out.println("5) Salir del menú");
		System.out.println("");
		System.out.println("**************************************");
		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}// APP concesionario
