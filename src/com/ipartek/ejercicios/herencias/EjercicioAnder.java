package com.ipartek.ejercicios.herencias;

import com.ipartek.pojo.GatoDomestico;
import com.ipartek.pojo.Profesor;

public class EjercicioAnder {

	public static void main(String[] args) {
		// CREAR EL PROFESOR BACTERIO QUE IMPARTE CIENCIAS

		Profesor profe = new Profesor();

		profe.setNombre("Bactertio");
		profe.setAsignatura("Ciencias");

		System.out.println(profe.getNombre());
		System.out.println(profe.getAsignatura());

		GatoDomestico gato = new GatoDomestico("");
		gato.setNombre("Ritxi");
		gato.setVacunado(false);
		gato.setCastrado(true);

		System.out.println(gato);
	}

}
