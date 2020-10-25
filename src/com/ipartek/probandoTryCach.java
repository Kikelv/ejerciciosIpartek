package com.ipartek;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class probandoTryCach {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce números. El cero para salir");

		int numero = 0;
		do {
			try {
				numero = reader.nextInt();
				lista.add(numero);
			} catch (InputMismatchException ime) {
				System.out.println("¡Cuidado! Solo puedes insertar números. ");
				reader.next();
			}
		} while (numero != 0);
	}

}
