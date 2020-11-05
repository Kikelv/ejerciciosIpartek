package com.ipartek.actividades.actividad3;

import java.util.ArrayList;
import java.util.Collections;
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

	// HASHMAP - Es como ponerle un índice a un arraylis. Sirve para no tener que
	// recorrer todo el array cuando quiera buscar un valor
	private static HashMap<Integer, Libro> hmLibros;
	private static ImplLibroDAO INSTANCE = null;
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

	// PATRÓN SINGLETON

	public static synchronized ImplLibroDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ImplLibroDAO();
		}
		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {

		// return new ArrayList<>(hmLibros.values()); ASÍ ES SIN ORDENACIÓN

		ArrayList<Libro> libros = new ArrayList<Libro>(hmLibros.values());

		// ordenacion por defecto que hemos definido en el Libro implements Comparable
		Collections.sort(libros);

		// ordenacion por paginas que hemos creado una nueva Clase que implements
		// Comparator<Libro>
		// libros.sort(new LibroComparatorPaginas());

		return libros;

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

		boolean resultado = false;
		boolean encontrado = false;
		String nombreLibro = l.getNombre();

		// buscar si existe el nombre en hashmap, recorriendo uno a uno todos los libros
		for (Iterator<Libro> iterator = hmLibros.values().iterator(); iterator.hasNext();) {

			Libro libroIteracion = iterator.next();
			if (nombreLibro.equalsIgnoreCase(libroIteracion.getNombre())) {
				encontrado = true;
				break;
			}

		} // for

		// si no existe, insertarlo y actulizar id
		if (!encontrado) {
			l.setId(indice); // setear el id en el objeto
			hmLibros.put(indice, l); // guardar objeto en hasmap
			indice++; // aqctualizar el indice para la sigueinte insercción
			resultado = true;
		}

		return resultado;
	}
}
