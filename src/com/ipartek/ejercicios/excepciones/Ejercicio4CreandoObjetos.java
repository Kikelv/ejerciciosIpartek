package com.ipartek.ejercicios.excepciones;

import java.util.ArrayList;

import com.ipartek.pojo.Persona;

/**
 * <h1>Ejercicio 4</h1> Crea una clase Persona con los atributos nombre y edad.
 * <br>
 * En el m�todo setEdad lanzar una excepci�n si la edad introducida es menor que
 * 0 o mayor que 120. <br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vac�o, y lea los datos por teclado y los asigne a los objetos
 * creados. <br>
 * Solo introducir� las personas en la lista si est�n en el rango de edad
 * indicado, comprob�ndolo mediante el uso de excepciones Ej: probar a crear las
 * siguientes personas:
 * <ol>
 * <li>�pepe� con 56 a�os</li>
 * <li>�matusalem� con 199 a�os</li>
 * </ol>
 * 
 * @author Enrique
 * @version 1.0
 */
public class Ejercicio4CreandoObjetos {

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>(); // creo el arraylist para ir metiendo las personas que
		/*
		 * // vaya creando int edad1 = 0;
		 * System.out.println("Introduce la edad de pepe"); Scanner sn = new
		 * Scanner(System.in);
		 * 
		 * int edad2 = 0; System.out.println("Introduce la edad de Matusalem"); Scanner
		 * sn1 = new Scanner(System.in);
		 */
		// TODO VER COMO PEDIR LOS DATOS

		// esto es para capturar las excepciones
		try {

			Persona p1 = new Persona();
			p1.setNombre("pepe");
			p1.setEdad(56);

			personas.add(p1); // esto lo ponemos despu�s de cada objeto. Si lo ponemos al final del todo , en
								// caso de que haya alguna excepci�n en cualquier objeto, no lo crear�a

			Persona p2 = new Persona();
			p2.setNombre("Matusalem");
			p2.setEdad(300);

			personas.add(p2);

		} catch (Exception e) {
			System.out.println(e.getMessage()); // lanza el mensaje que he declarado en el pojo persona
		} finally {

			// foreach para iterar sobre el ArrayList<Perona>. Se usa cuando vamos a iterar
			// sobre el array, sin operaciones m�s complejas. Es igual que el for pero m�s
			// sencillo.
			for (Persona p : personas) {
				System.out.println(p);
			}

			/*
			 * 
			 * Persona persona1 = new Persona(); persona1.setNombre("Ramona"); //
			 * persona1.setEdad(edad);
			 */
			/**
			 * Persona persona2 = new Persona(); persona2.setNombre("Jesus");
			 * persona2.setEdad(150);
			 */
			/*
			 * System.out.println("****************************");
			 * System.out.println("PERSONAS Y SU EDAD \n");
			 * System.out.println("****************************");
			 * System.out.printf("%s tiene %s a�os \n", persona1.getNombre(),
			 * persona1.getEdad()); // System.out.printf("%s tiene %s a�os \n",
			 * persona2.getNombre(), // persona2.getEdad()); System.out.println(persona1);
			 * // EN LA CLASE PERSONA HE HECHO EL .TOSTRING(), MENU -> SOURCE
			 */
		}

	}
}