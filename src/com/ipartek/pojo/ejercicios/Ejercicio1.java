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
				"El nombre del perro que particip� en las batallas del ej�rcito espa�ol en territorio americano es uno de los cl�sicos dentro de esta lista de perros famosos de la historia de Espa�a. Becerrillo form� parte de la contienda que mantuvieron los conquistadores espa�oles con su enemigo americano o ind�gena por el dominio de sus tierras.");

		Perro leoncico = new Perro();
		leoncico.setNombre("Leoncico");
		leoncico.setHistoria(
				"Becerrillo tuvo adem�s descendencia, siendo Leoncico el m�s c�lebre de sus v�stagos en la historia de Espa�a. Este acabar�a siendo el compa�ero fiel del aventurero y explorador Vasco N��ez de Balboa, con el que acudir�a a numerosas batallas en las que desempe�� un papel de importancia. De hecho, se le considera el primer perro europeo que pudo contemplar el Mar del Sur, nombre que recib�a el Oc�ano Pac�fico durante las primeras exploraciones espa�olas.");

		Perro lump = new Perro();
		lump.setNombre("Lump");
		lump.setHistoria(
				"La pintura espa�ola no se entiende hoy en d�a sin la figura de Pablo Picasso, pintor que forma parte del selecto grupo de personajes m�s influyentes del siglo XX en Espa�a. Sus trabajos son en la actualidad obras de arte imperecederas que se encuentran repartidas en museos de todo el mundo, de los que el Guernica es posiblemente el trabajo m�s reconocido.");

		Perro ajax = new Perro();
		ajax.setNombre("Ajax");
		ajax.setHistoria(
				"Corr�a el a�o 2009 cuando uno de los perros de la Guardia Civil ejerci� de h�roe para evitar lo que iba a ser un ataque bomba. Nos referimos al Atentado de Palma Nova en Mallorca, perpetrado por ETA. En �l fallecieron dos guardias civiles tras una primera explosi�n. Pero adem�s, estaba previsto que una segunda bomba estallara. Fue el pastor alem�n Ajax el que evitar�a dicha explosi�n al detectar el artefacto bajo un veh�culo, cuando patrullaba con los agentes de la Benem�rita.");

		Perro paco = new Perro();
		paco.setNombre("Paco");
		paco.setHistoria(
				"La historia de Espa�a y en este caso de Madrid tiene guardado un lugar en su memoria para el perro Paco. Nos referimos al que es posiblemente el perro callejero m�s famoso que ha habitado en la capital, y que durante el �ltimo cuarto del siglo XIX fue adoptado por el pueblo madrile�o protagonizando numerosas cr�nicas period�sticas de la �poca. Fue concretamente en los a�os 1881 y 1882 cuando se produjo el apogeo popular de la figura de este c�nido en las calles madrile�as, siendo utilizada para ejemplificar el costumbrismo de finales de siglo.");

		Perro canelo = new Perro();
		canelo.setNombre("Canelo");
		canelo.setHistoria(
				"Si hemos hablado de Paco como el perro de todos los madrile�os durante su �poca, en C�diz tambi�n emergi� con similar fuerza no hace mucho tiempo la figura de un c�nido en particular. Nos referimos a Canelo, otro compa�ero de cuatro patas que demostr� porqu� el perro es el mejor amigo del hombre al protagonizar una historia lacrim�gena con la que emocion� a toda la ciudad del sur de Espa�a.");

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
