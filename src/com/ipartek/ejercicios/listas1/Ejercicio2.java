package com.ipartek.ejercicios.listas1;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Futbolista;

/**
 * <h1>Ejercicio 2</h1>
 * <p>
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int. <br>
 * Solicitar los datos de los jugadores por teclado, y una vez introducido el
 * primero, se insertara en la lista y se preguntara si se desea introducir otro
 * más, para lo cual el usuario escribirá S o N. <br>
 * En caso afirmativo se volverá a pedir otro más, hasta que el usuario escriba
 * N
 * </p>
 * 
 * @author Enrique Laorden
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		boolean salir = false;
		ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();

		Futbolista f = new Futbolista(null, 0);
		f.setNombre("Aduriz");
		f.setDorsal(20);

		futbolistas.add(f);

		f = new Futbolista(null, 0);
		f.setNombre("Simon");
		f.setDorsal(1);

		futbolistas.add(f);

		do {

			System.out.println("Escribe el nombre de un futbolista y su dorsal: \n");
			Scanner sc = new Scanner(System.in);
			String nombre = sc.nextLine();
			int dorsal = Integer.parseInt(sc.nextLine());
			// sc.close();
			f = new Futbolista(null, 0);
			f.setNombre(nombre);
			f.setDorsal(dorsal);
			futbolistas.add(f);

			for (Futbolista t : futbolistas) {
				System.out.println(t);
			}
			// TODO ARREGLAR ESTO
			/*
			 * Scanner opcion = new Scanner(System.in); String opcion1 = sc.nextLine(); if
			 * (opcion1) { }
			 */
		} while (!salir);
		System.out.println("** FIN APP");
	}

}
