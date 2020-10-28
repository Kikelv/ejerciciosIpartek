package com.ipartek.ejercicios.interfaces;

import java.io.Serializable;

/**
 * Declaracion de la interfaz Modificacion
 */
public interface IModificacion extends Serializable, Cloneable {
	void incremento(int a);
}
