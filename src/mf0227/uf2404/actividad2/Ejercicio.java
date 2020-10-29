package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>
 * Realizar un programa que nos cree una lista de coches, para ello deber�
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos La
 * clase coche tendr� los siguientes atributos:<b> matricula, marca, modelo,
 * color, potencia, cilindrada.</b><br>
 * Para rellenar la lista se creara un men� que nos solicitara introducir los
 * datos por teclado, y una vez le�dos todos, se guardaran en un objeto que se
 * a�adir� a la lista y nos pedir� que indiquemos si queremos introducir un
 * veh�culo m�s o no. <br>
 * Una vez que no queramos introducir m�s coches, nos mostrara todo el contenido
 * en pantalla Realizar el ejercicio en base a las reglas de programaci�n
 * orientada a objetos.
 * 
 * <h2>EXTRAS:</h2>
 * <ul>
 * <li>Definir una interfaz IConducible con los m�todos arrancar y parar</li>
 * <li>Crear clase Vehiculo <b>( color, matricula )</b> para el Coche <b>(
 * marca, modelo, potencia, cilindrada)</b></li>
 * <li>Realizar un Diagrama de Clases</li>
 * </ul>
 * </p>
 * 
 * @author Enrique Laorden
 * @version 1
 */
public class Ejercicio {

	static ArrayList<Coche> lista = new ArrayList<Coche>(); // arrayList con el listado de coches
	static Scanner sc = new Scanner(System.in);
	static String marca = "";
	static String modelo = "";
	static String color = "";
	static String matricula = "";
	static int potencia = 0;
	static int cilindrada = 0;

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("========> ACTIVIDAD 2 <========");
		System.out.println("");

		menu(); // Llamada al men� donde se piden los datos hasta que el usuario decide salir.

		pintarArrayList(); // Llamada al m�todo para mostrar el listado completo de coches.
	}

	private static void pintarArrayList() {
		System.out.println("\nListado de coches registrados:\n");
		for (Coche coche : lista) {
			System.out.println(coche);
		}
	}

	private static void menu() {
		System.out.println("Para registrar un coche inserte los datos siguientes: \n");

		boolean salir = false; // declaro "salir" en falso para que cuando el usuario quiera pueda hacerlo

		do {
			System.out.println("\n-> Marca del veh�culo: ");
			marca = sc.nextLine();
			System.out.println("-> Modelo del " + marca);
			modelo = sc.nextLine();
			System.out.println("-> Color del " + marca + " " + modelo);
			color = sc.nextLine();
			System.out.println("-> Registra la matr�cula: ");
			matricula = sc.nextLine();
			System.out.println("-> Potencia del " + modelo);
			try {
				potencia = Integer.parseInt(sc.nextLine());

			} catch (Exception e) {
				System.out.println(" ** DEBE SER UNA CIFRA");
				// potencia = Integer.parseInt(sc.nextLine());
			}

			System.out.println("Cilindrada del " + modelo);
			try {
				cilindrada = Integer.parseInt(sc.nextLine());

			} catch (Exception e) {
				System.out.println(" ** DEBE SER UNA CIFRA");
				// cilindrada = Integer.parseInt(sc.nextLine());
			}

			Coche c = new Coche(); // creaci�n de los coches con sus atributos

			c.marca = marca;
			c.modelo = modelo;
			c.color = color;
			c.matricula = matricula;
			c.potencia = potencia;
			c.cilindrada = cilindrada;

			lista.add(c); // introducci�n a la lista

			System.out.println("Para salir pulse S, cualquier otra para continuar"); // opci�n para que el usuario pueda
																						// salir pulsando S

			String sal = sc.nextLine();
			if (sal.equalsIgnoreCase("s")) {
				salir = true;
			}

		} while (!salir); // El bucle seguir� hasta que el usuario cambie la opci�n salir, que es una
							// booleana
		System.out.println(" ** APP CERRADA **");
	}

}
