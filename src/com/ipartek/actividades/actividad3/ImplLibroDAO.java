package com.ipartek.actividades.actividad3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.ipartek.actividades.actividad3.modelo.ILibroDao;
import com.ipartek.actividades.actividad3.pojo.Libro;

/**
 * La implemantación del DAO
 * 
 * @author Enrique Laorden
 *
 */
public class ImplLibroDAO implements ILibroDao {

	private HashMap<Integer, Libro> hmLibros = new HashMap<Integer, Libro>();
	private int indice = 0;

	// Insertar valores "key"-"value" al HashMap

	public ImplLibroDAO() {
		super();
		hmLibros = new HashMap<Integer, Libro>();
		hmLibros.put(1, new Libro(1, "Diccionario", 600));
		hmLibros.put(2, new Libro(2, "Aprende Java", 300));
		hmLibros.put(3, new Libro(3, "Aprende SQL", 400));
		indice = 4;
	}

	@Override
	public List<Libro> getAll() {

		return new ArrayList<>(hmLibros.values());

	}

	@Override
	public Libro getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		hmLibros.remove(id);
		return true;
	}

	@Override
	public boolean insert(Libro l) {
		Collection<Libro> valores = hmLibros.values();
		boolean encontrado = false;

		// necesito comprobar si ya existe el libro
		for (Iterator<Integer> it = hmLibros.keySet().iterator(); it.hasNext();) {
			int key = (Integer) it.next();
			Libro value = hmLibros.get(key);

			if (l.getNombre().equalsIgnoreCase(value.getNombre())) {
				encontrado = true;

				break;
			}
		}

		if (encontrado == false) {
			l.setId(indice);
			indice++;
			hmLibros.put(indice, l);
		}

		return false;
	}
}
