package com.ipartek.ejercicios.variables;

/**
 * Realizar un programa que cree una variable de cada uno de los tipos de datos
 * simples que podemos encontrar en el lenguaje de programación Java,
 * asignándoles un valor.<br>
 * Una vez creadas, se mostraran por pantalla los valores de cada una de
 * ellas.<br>
 * De manera adicional, se buscara por internet o otras fuentes, los valores
 * máximos y mínimos que pueden albergar
 * 
 * 
 * @author Enrique Laorden
 * @version 1.0
 *
 */
public class ejercicio1 {

	public static void main(String[] args) {
		System.out.println("DATOS DE TIPO PRIMITIVOS");
		System.out.println("************************");

		byte numeroByte = 1;
		short numeroCorto = 3;
		int numeroEntero = 2;
		long numeroDoble = 6;

		System.out.println("(byte) " + numeroByte);
		System.out.println("(short) " + numeroCorto);
		System.out.println("(int) " + numeroEntero);
		System.out.println("(long) " + numeroDoble);

		System.out.println("----------Int----------");
		System.out.println("Valor máximo = " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo = " + Integer.MIN_VALUE);

		System.out.println("1 int = " + Integer.SIZE + " bits");
		System.out.println("1 short = " + Short.SIZE + " bits");
		System.out.println("1 byte = " + Byte.SIZE + " bits");
		System.out.println("1 long = " + Long.SIZE + " bits");
	}

}
