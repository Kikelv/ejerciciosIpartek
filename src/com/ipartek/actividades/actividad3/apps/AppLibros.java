package com.ipartek.actividades.actividad3.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.actividades.actividad3.ImplLibroDAO;
import com.ipartek.actividades.actividad3.pojo.Libro;

/**
 * 
 * La aplicación con las funcionalidades
 * 
 * @author Enrique Laorden
 *
 */
public class AppLibros extends AppGestion {

	// variables globales para esta Clase
	static private Scanner sc = null;
	static private ImplLibroDAO modelo = new ImplLibroDAO();

	// cuando usamos un patron singleton, el constructor es privado

	// deberemos usar el metodo getInstance();

	// static private LibroDao modelo = HmLibro.getInstance();

	static private String opcion = ""; // opcion seleccionada en el menu por el usuario

	public static void main(String[] args) {

		System.out.println("***********  APP  LIBRERÍA   **************");
		sc = new Scanner(System.in);

		boolean salir = false;

		pintarMenu("libros");

		do {
			opcion = sc.nextLine();
			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_CREAR:
				crear();
				break;

			case OP_MODIFICAR:
				modifcar();
				break;

			case OP_ELIMINAR:
				eliminar();
				break;

			case OP_SALIR:
				salir = true;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;

			}
		} while (!salir);

		sc.close();

	}

	protected static void modifcar() {
		// TODO desarrollar el método para modificar

		System.out.println("** Pendiente de desarrollar");

	}

	protected static void eliminar() {

		int id;

		// buscar libro por id para eliminarlo
		System.out.println("Dime el ID del libro para eliminar:");
		id = Integer.parseInt(sc.nextLine());

		if (modelo.delete(id) == false) {
			System.out.println("*Lo sentimos pero no existe ese libro");
		} else {
			System.out.println("Borrado el libro " + id);
		}
		listar(); // listamos para ver los libros

	}

	protected static void listar() {
		ArrayList<Libro> libros = (ArrayList<Libro>) modelo.getAll();
		for (Libro libro : libros) {
			System.out.println(libro + "\n");
		}

		pintarMenu("libro"); // pinto el menú para darle las opciones al usuario

	}

	protected static void crear() {
		int id;
		String nombre = "Aprende a programar";
		int paginas = 1000;

		System.out.println("Dime el nombre del libro que quieres registrar:");
		nombre = sc.nextLine();
		System.out.println("Dime cuántas páginas tiene el libro que quieres registrar:");
		paginas = Integer.parseInt(sc.nextLine());

		Libro l = new Libro(nombre, paginas);
		modelo.insert(l);
		listar(); // listado de libros para que el usuario lo compruebe
		System.out.println("\n");

	}

}
