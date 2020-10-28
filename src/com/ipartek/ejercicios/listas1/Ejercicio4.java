package com.ipartek.ejercicios.listas1;

import java.util.ArrayList;

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

	public static void main(String[] args) {

		/*
		 * ORDENADAS POR PALOS
		 * 
		 */

		for (int i = 0; i < PALOS_NOMBRES.length; i++) {
			String palo = PALOS_NOMBRES[i];

			// carta.setPalo(palo);
			System.out.println("========> " + palo + " <========");

			for (int j = 1; j < 11; j++) {
				Carta carta = new Carta();
				carta.setNum(j);
				carta.setPalo(palo);

				System.out.printf("%s %s \n", carta.getNum(), carta.getPalo());
				System.out.println("-------");

				baraja.add(carta);
			}
		}
		System.out.println("-------");
		System.out.println("-------");
		System.out.println("-------");

		/*
		 * ORDENADAS POR NÚMEROS
		 * 
		 */

		for (int j = 1; j < 11; j++) {

			System.out.println("========> " + j + " <========");
			for (int i = 0; i < PALOS_NOMBRES.length; i++) {

				String palo = PALOS_NOMBRES[i];
				Carta carta = new Carta();
				carta.setNum(j);
				carta.setPalo(palo);

				System.out.printf("%s %s \n", carta.getNum(), carta.getPalo());
			}
		}

	} // MAIN

} // CLASS
