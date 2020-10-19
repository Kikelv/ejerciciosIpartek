package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

public class Ejercicio1 {

	public static void main(String[] args) {

		Perro snoopy = new Perro();
		snoopy.setNombre("Snoopy");
		snoopy.setPeso(12);

		Perro pulgoso = new Perro();
		pulgoso.setNombre("Pulgoso");
		pulgoso.setPeso(-5);

		Perro becerrillo = new Perro();
		becerrillo.setNombre("BECERRILLO");
		becerrillo.setHistoria(
				"El nombre del perro que participó en las batallas del ejército español en territorio americano es uno de los clásicos dentro de esta lista de perros famosos de la historia de España. Becerrillo formó parte de la contienda que mantuvieron los conquistadores españoles con su enemigo americano o indígena por el dominio de sus tierras.");

		Perro leoncico = new Perro();
		leoncico.setNombre("Leoncico");
		leoncico.setHistoria(
				"Becerrillo tuvo además descendencia, siendo Leoncico el más célebre de sus vástagos en la historia de España. Este acabaría siendo el compañero fiel del aventurero y explorador Vasco Núñez de Balboa, con el que acudiría a numerosas batallas en las que desempeñó un papel de importancia. De hecho, se le considera el primer perro europeo que pudo contemplar el Mar del Sur, nombre que recibía el Océano Pacífico durante las primeras exploraciones españolas.");

		Perro lump = new Perro();
		lump.setNombre("Lump");
		lump.setHistoria(
				"La pintura española no se entiende hoy en día sin la figura de Pablo Picasso, pintor que forma parte del selecto grupo de personajes más influyentes del siglo XX en España. Sus trabajos son en la actualidad obras de arte imperecederas que se encuentran repartidas en museos de todo el mundo, de los que el Guernica es posiblemente el trabajo más reconocido.");

		Perro ajax = new Perro();
		ajax.setNombre("Ajax");
		ajax.setHistoria(
				"Corría el año 2009 cuando uno de los perros de la Guardia Civil ejerció de héroe para evitar lo que iba a ser un ataque bomba. Nos referimos al Atentado de Palma Nova en Mallorca, perpetrado por ETA. En él fallecieron dos guardias civiles tras una primera explosión. Pero además, estaba previsto que una segunda bomba estallara. Fue el pastor alemán Ajax el que evitaría dicha explosión al detectar el artefacto bajo un vehículo, cuando patrullaba con los agentes de la Benemérita.");

		Perro paco = new Perro();
		paco.setNombre("Paco");
		paco.setHistoria(
				"La historia de España y en este caso de Madrid tiene guardado un lugar en su memoria para el perro Paco. Nos referimos al que es posiblemente el perro callejero más famoso que ha habitado en la capital, y que durante el último cuarto del siglo XIX fue adoptado por el pueblo madrileño protagonizando numerosas crónicas periodísticas de la época. Fue concretamente en los años 1881 y 1882 cuando se produjo el apogeo popular de la figura de este cánido en las calles madrileñas, siendo utilizada para ejemplificar el costumbrismo de finales de siglo.");

		Perro canelo = new Perro();
		canelo.setNombre("Canelo");
		canelo.setHistoria(
				"Si hemos hablado de Paco como el perro de todos los madrileños durante su época, en Cádiz también emergió con similar fuerza no hace mucho tiempo la figura de un cánido en particular. Nos referimos a Canelo, otro compañero de cuatro patas que demostró porqué el perro es el mejor amigo del hombre al protagonizar una historia lacrimógena con la que emocionó a toda la ciudad del sur de España.");

		System.out.println(snoopy.getNombre() + " " + snoopy.getPeso());
		System.out.println(pulgoso.getNombre() + " " + pulgoso.getPeso());
		System.out.println(becerrillo.getNombre() + " / " + becerrillo.getHistoria());
		System.out.println(leoncico.getNombre() + " / " + leoncico.getHistoria());
		System.out.println(lump.getNombre() + " / " + lump.getHistoria());
		System.out.println(ajax.getNombre() + " / " + ajax.getHistoria());
		System.out.println(paco.getNombre() + " / " + paco.getHistoria());
		System.out.println(canelo.getNombre() + " / " + canelo.getHistoria());
	}

}
