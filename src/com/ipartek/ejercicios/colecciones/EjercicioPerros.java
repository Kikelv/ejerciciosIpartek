package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class EjercicioPerros {

	public static void main(String[] args) {

		// CREO EL ARRAYLIST PARA IR METIENDO LOS PERROS
		ArrayList<Perro> perros = new ArrayList<Perro>();

		// insertamos perros. Fijarse cómo se reutiliza la variable p con cada uno de
		// los perros

		Perro p = new Perro();
		p.setNombre("Laika");
		p.setPeso(25);
		p.setRaza("Mastín");
		// TODO setear más atributos

		perros.add(p);

		p = new Perro();
		p.setNombre("Lisa");
		p.setPeso(4);

		perros.add(p);

		p = new Perro();
		p.setNombre("Tobi");
		p.setPeso(50);

		perros.add(p);

		// insertar en modo rápido usando el constructor SOBRECARGADO (FIJARSE BIEN EN
		// LOS DATOS QUE HAY QUE PASAR Y EL ORDEN):
		perros.add(new Perro("Bob"));
		perros.add(new Perro("Rufo", "chiguagua", 2));

		// insertar en una posicion:
		perros.add(2, new Perro("Mendi"));

		// Esto pinta en consola el mensaje que he fijado en el pojo perro
		for (Perro pe : perros) {
			System.out.println(pe);
		}
//TODO TRASTEAR UN POCO MÁS, AÑADIR ATRIBUTOS ETC
	}

}
