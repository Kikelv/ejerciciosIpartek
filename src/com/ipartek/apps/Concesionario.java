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
	static final private String OPCION_VER = "1";
	static final private String OPCION_INSERTAR = "2";
	static final private String OPCION_MODIFICAR = "3";
	static final private String OPCION_ELIMINAR = "4";
	static final private String OPCION_MENU = "M";
	static final private String OPCION_SALIR = "s";
	private static String buscar;

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
			System.out.println("");
			System.out.println("Pulsa " + OPCION_SALIR + " para salir o " + OPCION_MENU + " para ir al menú");
			System.out.println("");
			opcion = sc.nextLine();

			if (opcion.equalsIgnoreCase(OPCION_MENU)) {
				menuPrincipal();
			} else if (opcion.equalsIgnoreCase(OPCION_SALIR))
				System.out.println("Vuelve pronto");
			break;

		case OPCION_INSERTAR: // AÑADIR UN NUEVO COCHE
			// TODO introduzco un coche, selecciono introducir otro y me obliga a meter 2
			// antes de la opción de salir al menú
			System.out.println("AÑADIR");
			nuevoCoche();
			System.out.println("");
			System.out.println("\\\\/\\\\/ SE HA AÑADIDO TU COCHE AL STOCK \\\\/\\\\/");
			System.out.println("");

			for (Coche c : coches) {
				System.out.println(c);
			}
			System.out.println("");
			System.out.println(
					"Pulsa " + OPCION_INSERTAR + " para añadir otro coche o " + OPCION_MENU + " para ir al menú");
			System.out.println("");
			opcion = sc.nextLine();

			if (opcion.equalsIgnoreCase(OPCION_MENU)) {
				menuPrincipal();
			} else if (opcion.equalsIgnoreCase(OPCION_INSERTAR))
				nuevoCoche();
			break;

		case OPCION_MODIFICAR: // MODIFICAR UN COCHE
			System.out.println("Elige el modelo que quieres modificar:\n");

			buscar = sc.nextLine();

			for (int i = 0; i < coches.size(); i++) {

				Coche coche = coches.get(i);

				if (buscar.equalsIgnoreCase(coche.getModelo())) {

					System.out.println("1.- Modelo, 2.- Precio,");
					String elegirCambio = sc.nextLine();

					switch (elegirCambio) {
					case "1":
						System.out.println("Nuevo nombre");
						String nuevoModelo = sc.nextLine();
						coche.setModelo(nuevoModelo);

						for (Coche c : coches) {
							System.out.println("");
							System.out.println(c);
						}

						System.out.println("");
						System.out.println("Pulsa " + OPCION_MODIFICAR + " para añadir otro coche o " + OPCION_MENU
								+ " para ir al menú");
						System.out.println("");
						opcion = sc.nextLine();

						if (opcion.equalsIgnoreCase(OPCION_MENU)) {
							menuPrincipal();
						} else if (opcion.equalsIgnoreCase(OPCION_MODIFICAR))
							nuevoCoche();
						break;

					case "2":
						System.out.println("Nuevo precio");
						float nuevoPrecio = sc.nextFloat();
						coche.setPrecio(nuevoPrecio);

						for (Coche c : coches) {
							System.out.println("");
							System.out.println(c);
						}
						break;
					default:
						System.out.println("qué??");
						break;
					}

					break; // salir del for
				}
			}

			break;

		case OPCION_ELIMINAR: // ELIMINAR UN COCHE
			System.out.println("Elige el modelo que quieres eliminar:\n");

			buscar = sc.nextLine();
			for (int i = 0; i < coches.size(); i++) {

				Coche pIteracion = coches.get(i);

				if (buscar.equalsIgnoreCase(pIteracion.getModelo())) {
					coches.remove(i);
					break; // salir del for
				}
			}
			for (Coche c : coches) {
				System.out.println(c);
			}

			System.out.println("");
			System.out.println(
					"Pulsa " + OPCION_ELIMINAR + " para eliminar otro coche o " + OPCION_MENU + " para ir al menú");
			System.out.println("");
			opcion = sc.nextLine();

			if (opcion.equalsIgnoreCase(OPCION_MENU)) {
				menuPrincipal();
			} else if (opcion.equalsIgnoreCase(OPCION_ELIMINAR))
				nuevoCoche();

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
		} // SWICH DE LAS OPCIONES DEL MENÚ

	} // FIN DE OPCIONES

	private static void nuevoCoche() {
		System.out.println("**************************************");
		System.out.println("Escribe la marca del coche");
		String marca = sc.nextLine();
		System.out.println("**************************************");
		System.out.println("Escribe el modelo del coche");
		String modelo = sc.nextLine();

		coches.add(new Coche(marca, modelo, 0));

	}

	private static void menuPrincipal() {
		System.out.println("***************  MENÚ  ***************");
		System.out.println("");
		System.out.println(OPCION_VER + ") Ver coches disponibles");
		System.out.println(OPCION_INSERTAR + ") Insertar nuevo coche");
		System.out.println(OPCION_MODIFICAR + ") Modificar coche existente");
		System.out.println("4) Vender coche");
		System.out.println("5) Salir del menú");
		System.out.println("");
		System.out.println("**************************************");
		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}// APP concesionario
