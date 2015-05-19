package logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Wilber
 */
public class GestorLibro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ArrayList<Libro> listaLibros;

	public GestorLibro(ArrayList<Libro> listaLibros) {
		super();
		this.listaLibros = listaLibros;
	}

	public GestorLibro() {
		listaLibros = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro nuevoLibro) {

		listaLibros.add(nuevoLibro);
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

	public static Libro crearLibro(String titulo, String autor,
			String descrripcion, String valor) {
		if(Util.validarValor(valor)){
		return new Libro(titulo, autor, descrripcion, Double.parseDouble(valor));
		}
		return null;
	}

}
