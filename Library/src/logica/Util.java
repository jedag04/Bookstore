package logica;

import modelo.dao.Usuario;

public class Util {

	public static boolean validarValor(String numero) {

		try {
			Double.parseDouble(numero);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static String[] sitioAVector(Libro libro) {
		return new String[] { Integer.toString(libro.getId()),
				libro.getTitulo(), libro.getDescrripcion(), libro.getAutor(),
				Double.toString(libro.getValor()) };
	}

	public static String[] UsuarioVector(Usuario usuario) {

		return new String[] { Integer.toString(usuario.getId()),
				usuario.getNombre(), Double.toString(usuario.getPresupuesto()) };
	}
}
