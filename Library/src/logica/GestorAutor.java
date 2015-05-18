package logica;

import java.util.ArrayList;

/**
 * @author Wilber
 */
public class GestorAutor {
	private final ArrayList<Autor> listAutors;

	public GestorAutor(ArrayList<Autor> listAutors) {
		super();
		this.listAutors = listAutors;
	}

	public GestorAutor() {
		listAutors = new ArrayList<Autor>();
	}

	public void agregarAutor(int id, String nombre) {

		listAutors.add(new Autor(id, nombre));
	}

	public void eliminarAutor(int id) {
		Autor autor = buscarAutor(id);
		if (autor != null) {
			listAutors.remove(autor);

		}
	}

	public Autor buscarAutor(int id) {
		for (Autor autor : listAutors) {
			if (autor.getId() == id) {
				return autor;
			}

		}
		return null;
	}

	public static Autor crearAutor(int id, String nombre) {

		return new Autor(id, nombre);

	}

}
