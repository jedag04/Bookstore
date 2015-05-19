package modelo.util;

import modelo.dao.Libro;
import modelo.dao.Usuario;

public class Util {
	/**
	 * @author Wilber
	 */
	public static boolean validarValor(String numero) {
		try {
			Double.parseDouble(numero);

		} catch (Exception e) {
			return false;
		}

		return true;

	}

	public static String[] UsuarioVector(Usuario usuario) {

		return new String[] { Integer.toString(usuario.getId()),
				usuario.getNombre(), Double.toString(usuario.getPresupuesto()) };
	}

	public static String[] LibroVector(Libro libro) {

		return new String[] { Integer.toString(libro.getId()),
				libro.getTitulo(), libro.getDescrripcion(),
				Double.toString(libro.getValor()) };
	}

}
