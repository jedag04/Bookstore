package logica;

import modelo.SitioTuristico;

public class Libreria {

	private GestorUsuario gestorUsuario;
	private GestorAutor gestorAutor;
	private GestorLibro gestorLibro;

	public Libreria() {

	}

	public void registrarCompra() {

	}

	// al registrar un usuario,
	public boolean registrarUsuario(Usuario nuevo){
		if(gestorUsuario.buscarUsuario(nuevo.getId())==null){
			gestorUsuari
			return true;
		}
		/*else{Usuario Rta = this.buscarUsuario(nuevo.getId());
			if (!Rta.isEstado()) 
				Rta.alta();
				return true;
			}
		}*/
		
			return false;
		}

	public boolean registrarAutor(Autor nuevo) {

		if (this.gestorAutor.buscarAutor(nuevo.getId()) == null) {
			this.gestorAutor.agregarAutor(null, null);
			return true;
		}

		return false;
	}

	public void registrarLibro(String isbn, String autor, String titulo) {
		Libro libro = new Libro(isbn, autor, titulo);
		Libros.add(libro);
	}

}