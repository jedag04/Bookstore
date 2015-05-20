package modelo.dao;

import java.io.Serializable;
import java.util.ArrayList;

import modelo.util.Util;

/**
 * @author Wilber
 */
public class GestorUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ArrayList<Usuario> listaUsuarios;

	public GestorUsuario(ArrayList<Usuario> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}

	public GestorUsuario() {
		listaUsuarios = new ArrayList<Usuario>();
	}

	public void agregarUsuario(Usuario nuevoUsuario) {

		listaUsuarios.add(nuevoUsuario);
	}

	public void editarUsuario(int id, String nombre) {
		Usuario usuario = buscarUsuario(id);

		if (usuario != null) {

			usuario.setId(id);
			usuario.setNombre(nombre);
		}
	}

	public void eliminarUsuario(int id) {
		Usuario usuario = buscarUsuario(id);
		if (usuario != null) {
			listaUsuarios.remove(usuario);

		}
	}

	public Usuario buscarUsuario(int id) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId() == id) {
				return usuario;
			}

		}
		return null;
	}

	public static Usuario crearUsuario(String nombre, String presupuesto) {
		if (Util.validarValor(presupuesto)) {
			return new Usuario(nombre, Double.parseDouble(presupuesto));
		}
		return null;

	}
}
