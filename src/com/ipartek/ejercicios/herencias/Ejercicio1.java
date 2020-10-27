package com.ipartek.ejercicios.herencias;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.TelePlana;
import com.ipartek.pojo.Televisor;

/**
 * Realizar las siguientes jerarquías de herencia: tendremos una clase padre que
 * se llamara <b>Electrodoméstico.</b> <br>
 * Dicha clase contara con los atributos <i>nombre y precio.</i><br>
 * Se realizaran todos los constructores, métodos get y set necesarios Una vez
 * creada dicha clase, se creara una serie de clases hijas. La primera será la
 * clase televisor. <br>
 * Dicha clase contara con el atributo pulgadas, así como con todos los
 * constructores y métodos necesarios para rellenar sus atributos, incluidos los
 * del padre También se creara una clase televisionPlana, que heredara de
 * televisión, tendrá el atributo string tipo de pantalla ( tft, plasma,..) y
 * constructores, métodos get y set para rellenar los datos de los objetos que
 * se creen, incluyendo todos los atributos de los objetos de las clases padres
 * de las que heredan Una vez creado esta jerarquía de herencia, realizar un
 * programa que nos pida insertar televisiones planas dentro de un array de
 * electrodomésticos. <br>
 * Dicho array constara de 5 electodomesticos, pero lo rellenaremos con objetos
 * de tipo televisiónPlana.
 * 
 * @author Enrique Laorden
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Electrodomestico> lista = new ArrayList<>(); // En este ArrayList meteremos los electrodomésticos,
																// sean teles, lavadoras, neveras etc. Electrodomestico
																// es la clase padre

		System.out.println("Introduce la marca, el precio, las pulgadas y el tipo de pantalla: ");
		Scanner sc = new Scanner(System.in);
		/*
		 * for (int i = 0; i < 3; i++) { // Bucle para crear 3 objetos de TelePlana
		 * 
		 * String nombre = sc.nextLine(); float precio =
		 * Integer.parseInt(sc.nextLine()); int pulgadas =
		 * Integer.parseInt(sc.nextLine()); String pantalla = sc.nextLine();
		 * 
		 * TelePlana tv = new TelePlana(); // Creamos objeto con clase TelePlana
		 * tv.setNombre(nombre); tv.setPrecio(precio); tv.setPulgadas(pulgadas);
		 * tv.setPantalla(pantalla); lista.add(tv); System.out.println("Añadida la " +
		 * nombre);
		 * 
		 * }
		 */
		Electrodomestico elec1 = new Electrodomestico(); // Como este objeto es una lavadoralo creamos con clase
															// Electrodomestico, que es el padre
		elec1.setNombre("Lavadora BALAY");
		elec1.setPrecio(300);
		lista.add(elec1);

		Televisor tele = new Televisor(); // Como esta tele no es plana la creamos con Televisor
		tele.setNombre("Telefunken");
		tele.setPrecio(400);
		tele.setPulgadas(30);
		lista.add(tele);

		// CONSTRUCTORES SOBRECARGADOS:

		lista.add(new Electrodomestico("Horno AEG", 200));

		lista.add(new Televisor("Sony", 150, 42));

		lista.add(new TelePlana("Samsung", 75, 32, "plasma"));

		// TODO CASTEAR Y USAR instanceof
		for (Electrodomestico electrodomestico : lista) {
			System.out.println(electrodomestico.toString());

			System.out.printf("** electrodomestico \n" + electrodomestico);

		}

		System.out.println("** FIN");
		sc.close();
		/*
		 * for (int i = 0; i < planas.size(); i++) { System.out.println(planas); }
		 */
		// System.out.println(lista);

	}

}
