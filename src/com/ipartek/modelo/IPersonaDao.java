package com.ipartek.modelo;

import com.ipartek.pojo.Persona;

public interface IPersonaDao extends IDao<Persona> {

	Persona recuperarPorDni(String dni);

}
