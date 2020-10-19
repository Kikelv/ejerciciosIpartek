package com.ipartek;

public class UtilidadesEjercicioExcepciones3 {

	static String FRASE = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";

	static public char calcularPosicion() throws Exception {

		char letra;

		/**
		 * if (numeros == null) { throw new Exception("No puede ser null"); }
		 * 
		 * if (numeros.length() != 8) { throw new Exception("Los numeros de un dni son
		 * 8"); }
		 */
		try {
			letra = FRASE.charAt(5);
			System.out.println(letra);

		} catch (Exception e) {
			throw new Exception("error");
		}

		return letra;
	}

}
