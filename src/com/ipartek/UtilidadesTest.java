package com.ipartek;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilidadesTest {

	@Test
	public void testCalcularVueltas() throws Exception {
		Utilidades u = new Utilidades();

		float resultado = u.calcularVueltas(100, 100);
		float esperado = 0;
		assertEquals(resultado, esperado, 0.01); // desviación por ser la librería 4. Para al float es necesario poner
													// 0.01
	}

}
