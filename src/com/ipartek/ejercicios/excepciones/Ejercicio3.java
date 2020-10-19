package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada. <br>
 * Llámelo pasando como parámetro un String sin inicializar. <br>
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de
 * producirse una excepción por un paso de parámetros a null, no acabe con la
 * ejecución del programa. <br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto<b><i> “La lluvia en
 * Sevilla no es una maravilla”</b></i>)
 * 
 * @author Enrique Laorden
 * @version 1.0
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Escriba una frase");

		System.out.println("Escriba un número");
		// String letra = UtilidadesEjercicioExcepciones3.calcularPosicion();
		// System.out.println(letra);

	}

}
