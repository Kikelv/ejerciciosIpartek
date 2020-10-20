package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * <h1>Ejercicio 4</h1> Crea una clase Persona con los atributos nombre y edad.
 * <br>
 * En el método setEdad lanzar una excepción si la edad introducida es menor que
 * 0 o mayor que 120. <br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
 * creados. <br>
 * Solo introducirá las personas en la lista si están en el rango de edad
 * indicado, comprobándolo mediante el uso de excepciones
 * 
 * @author Admin
 * @version 1.0
 */
public class Ejercicio4CreandoObjetos {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int edad = 1000;

		System.out.println("Escriba la edad de Ramona");

		Persona persona1 = new Persona();
		persona1.setNombre("Ramona");
		// persona1.setEdad(edad);

		/**
		 * Persona persona2 = new Persona(); persona2.setNombre("Jesus");
		 * persona2.setEdad(150);
		 */
		System.out.println("****************************");
		System.out.println("PERSONAS Y SU EDAD \n");
		System.out.println("****************************");
		System.out.printf("%s tiene %s años \n", persona1.getNombre(), persona1.getEdad());
		// System.out.printf("%s tiene %s años \n", persona2.getNombre(),
		// persona2.getEdad());
		System.out.println(persona1); // EN LA CLASE PERSONA HE HECHO EL .TOSTRING(), MENU -> SOURCE
// TODO ACABAR ESTO
	}

}
