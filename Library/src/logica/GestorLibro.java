package logica;

import java.util.ArrayList;

/**
 * @author Wilber
 */
public class GestorLibro {
	private final ArrayList<Libro> listaLibros;

	public GestorLibro(ArrayList<Libro> listaLibros) {
		super();
		this.listaLibros = listaLibros;
	}

	public GestorLibro() {
		listaLibros = new ArrayList<Libro>();
	}

	public void agregarLibro(int id, String titulo, Autor autor,
			String descrripcion, double valor) {

		listaLibros.add(new Libro(id, titulo, autor, descrripcion, valor));
	}

	public void editarLibro(int id, String titulo, String autor,
			String descrripcion, double valor) {
		Libro libro = buscarLibro(id);

		if (libro != null) {

			libro.setId(id);
			libro.setTitulo(titulo);
		}
	}

	public void eliminarLibro(int id) {
		Libro libro = buscarLibro(id);
		if (libro != null) {
			listaLibros.remove(libro);

		}
	}

	public Libro buscarLibro(int id) {
		for (Libro libro : listaLibros) {
			if (libro.getId() == id) {
				return libro;
			}

		}
		return null;
	}

	public static Libro crearLibro(int id, String titulo, Autor autor,
			String descrripcion, double valor) {

		return new Libro(id, titulo, autor, descrripcion, valor);

	}

}
