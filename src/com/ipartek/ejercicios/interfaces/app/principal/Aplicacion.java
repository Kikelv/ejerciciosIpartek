package com.ipartek.ejercicios.interfaces.app.principal;

import com.ipartek.ejercicios.interfaces.app.clases.Patinete;

/**
 * <h1>Ejercicio Interfaces</h1>
 * <p>
 * Ver carpeta de ejercicios:
 * <a href= "C:\Users\Admin\Desktop\IPARTEK\Recursos\Ejercicios">Interfaces</a>
 * </p>
 * 
 * @author Enrique Laorden
 * @version 1
 *
 */
public class Aplicacion {
	public static void main(String[] args) {

		Patinete p = new Patinete();

		// p.apagar();

		p.arrancar();
		p.acelerar(10000);
		p.frenar(79);
		p.apagar();
		System.out.println(p.toString());

		/*
		 * Bici b = new Bici(); b.arrancar(); b.acelerar(500); b.frenar(10); //
		 * b.apagar(); System.out.println(b.toString());
		 */

	}

}
