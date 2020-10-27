package com.ipartek.ejercicios.listas1;

import java.util.ArrayList;

/**
 * <h1>Ejercicio 1</h1>
 * <p>
 * Crear una lista de nombres de alumnos, donde se guardaran con <b>strings</b>.
 * <br>
 * Insertar diez nombres de alumnos en la lista. <br>
 * Mostrar los diez nombres recorriendo la lista con un <b>foreach</b>
 * </p>
 * 
 * @author Enrique Laorden
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList alumnos = new ArrayList();
		alumnos.add("kike");
		alumnos.add("pepa");
		alumnos.add("carmen");
		alumnos.add("gorka");

		for (Object alumno : alumnos) {
			System.out.println(alumno);
		}
	}

}
