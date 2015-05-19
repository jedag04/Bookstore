package logica;

public class Util {
	/**
	 * @author Wilber
	 */
	public static String[] UsuarioVector(Usuario usuario) {
		return new String[] { Integer.toString(usuario.getId()),
				usuario.getNombre() };
		// Double.toString(sitio.getValor())

	}

}
