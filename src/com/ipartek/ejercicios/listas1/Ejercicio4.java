package com.ipartek.ejercicios.listas1;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.pojo.Carta;

/**
 * <h1>Ejercicio 4</h1>
 * <p>
 * Crear una lista que contenga las cuarenta cartas de una baraja. Para crear
 * dicha lista se creara una clase de tipo carta, que tendrá un número entero
 * para el valor de la carta, así como un string con el palo de la baraja
 * (copas, espadas, oros, bastos). Crear la baraja con las cartas ordenadas por
 * palos, y luego por números. Barajar dicha baraja y mostrar las cartas.
 * </p>
 * 
 * @author Enrique Laorden
 *
 */
public class Ejercicio4 {

	static ArrayList<Carta> baraja = new ArrayList<Carta>();
	static final String PALOS_NOMBRES[] = { "bastos", "copas", "oros", "espadas" };
	static final int NUMERO_CARTAS = 10;

	public static void main(String[] args) {

		/*
		 * ORDENADAS POR PALOS
		 * 
		 */
		ordenPalos();

		/*
		 * ORDENADAS POR NÚMEROS
		 * 
		 */
		ordenNumeros();

		/*
		 * PINTAR EL ARRAYLIST
		 * 
		 */
		pintarArrayList();

		/*
		 * BARAJAR
		 * 
		 */
		barajear();

	} // MAIN

	// Para desorenar un ArrayList usaremos "shuffle". Para ello hay que importar la
	// clase "Collections". Después haré el bucle for para recorrerlo y pintarlo.

	private static void barajear() {
		System.out.println("");
		System.out.println("========> BARAJEAR <========");
		System.out.println("");

		Collections.shuffle(baraja);
		for (int i = 0; i < baraja.size(); i++) {
			System.out.println(baraja.get(i));
		}

	}

	// En este caso uso el foreachpor ser más sencillo y el toString que he definido
	// en Carta.
	private static void pintarArrayList() {
		System.out.println("");
		System.out.println("========> CARTAS DEL ARRAYLIST <========");
		System.out.println("");

		for (Carta carta : baraja) {

			System.out.println(carta.toString());
		}

	}

// Para ordenar por números hago un bucle for sobre el número total de cartas y dentro de él otro buble con los palos. 
// Uso el constructor sobrecargado para crear la carta con el número y el palo.
	private static void ordenNumeros() {
		System.out.println("");
		System.out.println("========> ORDENADAS POR NUMEROS <========");
		System.out.println("");
		for (int j = 1; j <= NUMERO_CARTAS; j++) {

			System.out.println("========> " + j + " <========");
			for (int i = 0; i < PALOS_NOMBRES.length; i++) {

				String palo = PALOS_NOMBRES[i];
				Carta carta = new Carta(j, palo); // sobrecargado
				carta.setNum(j);
				carta.setPalo(palo);

				System.out.printf("%s %s \n", carta.getNum(), carta.getPalo());
			}
		}

	}

// En este caso hago buble sobre los palos y dentro otro sobre los números. 
	private static void ordenPalos() {
		System.out.println("");
		System.out.println("========> ORDENADAS POR PALOS <========");
		System.out.println("");
		for (int i = 0; i < PALOS_NOMBRES.length; i++) {
			String palo = PALOS_NOMBRES[i];

			System.out.println("========> " + palo + " <========");
			System.out.println("-------");
			for (int j = 1; j < 11; j++) {
				Carta carta = new Carta(j, palo);
				carta.setNum(j);
				carta.setPalo(palo);

				System.out.printf("%s %s \n", carta.getNum(), carta.getPalo());
				System.out.println("-------");

				baraja.add(carta);
			}
		}

	}

} // FIN CLASS
