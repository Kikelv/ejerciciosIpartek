package com.ipartek.actividades;

import java.util.ArrayList;

/**
 * A) Realizar un programa en java que realice la siguiente funci�n: <b>Crear un
 * array de 5 notas que almacenara en formato double.</b><br>
 * Una vez creado dicho array se rellenaran dichos elementos ley�ndolo desde el
 * teclado. Una vez creado el contenido, se calculara la media de las notas as�
 * como se mostraran las notas m�s altas y m�s bajas de dicho array.
 * 
 * @author Enrique Laorden
 * @version 1
 */

public class EjercicioPractico1A {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>(); // Creo el arraylist vac�o para despu�s meter las notas.

		// Relleno el arraylist con las notas
		notas.add((double) 5.5);
		notas.add((double) 8.5);
		notas.add((double) 9);
		notas.add((double) 6);
		notas.add((double) 9.5);

		// Declaro las variables que usar�
		double suma = 0;
		double media = 0;
		double max = (double) 0;
		double min = (double) 10;

		System.out.println("");
		System.out.println("Las notas de la clase son las siguintes: " + notas + "\n"); // Las muestro en la consola

		for (int i = 0; i < notas.size(); i++) { // En este bucle calculo la suma y con la suma saco la media
													// ** CORRIJO PARA METER LAS M�XIMAS Y M�NIMAS EN EL MISMO BUCLE.
			suma += notas.get(i);
			media = suma / notas.size();
			if (notas.get(i) > max) {
				max = notas.get(i);
			}
			if (notas.get(i) < min) {
				min = notas.get(i);
			}
		}

		System.out.println("La nota media es: " + media + "\n");

		System.out.println("La nota m�nima es: " + min);
		System.out.println("La nota m�xima es: " + max);

	} // fin main

}// fin class
