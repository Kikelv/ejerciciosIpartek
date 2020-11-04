package com.ipartek.ejercicios.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.ipartek.pojo.Perro;

/**
 * 
 * 
 * @author Enrique Laorden
 *
 */
public class HashMapEjemplo {

	public static void main(String[] args) {
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		global.put("Laura", "667895789");
		global.put("Pepe", "645895756");
		global.put("Abelardo", "55895711");
		global.put("Daniel", "667111788");
		global.put("Arturo", "667598623");

		// probar a meter un duplicado
		global.put("Arturo", "666555444");

		// recuperar el value por la Key
		String telefonoPepe = global.get("Pepe");

		// obtener todas las Keys
		Set<String> keys = global.keySet();

		// obtener todos los values
		Collection<String> values = global.values();

		// Definir Iterator para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			String value = (String) global.get(key);
			System.out.println("Alumno: " + key + " - " + "Telefono: " + value);
		}

		// definir una hashamp con perros la key será su id(int) y el value(Perro)
		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();

		// meter 2 perros

		float peso = 10f;
		String raza = "boxer";
		String nombre = "Toby";
		Perro pNuevo = new Perro(nombre, raza, peso);
		pNuevo.setId(10);

		peso = 5f;
		raza = "caniche";
		nombre = "Lisa";
		Perro pNuevo2 = new Perro(nombre, raza, peso);
		pNuevo2.setId(11);

		peso = 50f;
		raza = "mastin";
		nombre = "Gorda";
		Perro pNuevo3 = new Perro(nombre, raza, peso);
		pNuevo3.setId(12);

		hmPerros.put(10, pNuevo);
		hmPerros.put(11, pNuevo2);
		hmPerros.put(12, pNuevo3);

		// recorrer con un Iterator
		for (Iterator<Integer> it = hmPerros.keySet().iterator(); it.hasNext();) {
			int key = (Integer) it.next();
			Perro value = hmPerros.get(key);
			System.out.println("Identificación: " + key + " => " + "Datos: " + value);
		}
	}

}
