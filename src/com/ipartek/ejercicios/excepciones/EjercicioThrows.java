package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Hacer un programa que solicite los n�meros del dni y que calcule la
 * letra.<br>
 * Usar el m�todo de la clase utilidades.<br>
 * Tenemos que capturar la excepci�n que nos lanza la funci�n
 * <b>calcularLetraDni</b>
 * 
 * @author Enrique Laorden
 *
 */

public class EjercicioThrows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe los n�meros de tu DNI");
		String numeros = sc.nextLine();

		try {
			String dniCompleto = Utilidades.calcularLetraDni(numeros);
			System.out.println("Es: " + dniCompleto);
		} catch (Exception e) {
			System.out.println("DNI no v�lido");
		}

		sc.close();
	}

}
