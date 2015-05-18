package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.DialogoAdministrador;
import presentacion.DialogoAgregarAutor;
import presentacion.DialogoAgregarLibro;
import presentacion.DialogoAgregarUsuario;
import presentacion.DialogoUsuario;
import presentacion.Ventana;

public class Controlador implements ActionListener{
	
	public static final String A_ABRIR_ADMINISTRADOR = "ABRIR_ADMINISTRADOR";
	public static final String A_ABRIR_USUARIO = "ABRIR_USUARIO";
	public static final String A_AGREGAR_LIBRO = "AGREGAR_LIBRO";
	public static final String A_AGREGAR_USUARIO = "AGREGAR_USUARIO";
	public static final String A_AGREGAR_AUTOR = "AGREGAR_AUTOR";
	private Ventana ventana;
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	private DialogoAgregarLibro dialogoAgregarLibro;
	private DialogoAgregarUsuario dialogoAgregarUsuario;
	private DialogoAgregarAutor dialogoAgregarAutor;

	public Controlador() {
		ventana = new Ventana(this);
		dialogoAdministrador = new DialogoAdministrador(ventana,this);
		dialogoUsuario = new DialogoUsuario(ventana, this);
		dialogoAgregarLibro = new DialogoAgregarLibro(ventana, this);
		dialogoAgregarUsuario = new DialogoAgregarUsuario(ventana, this);
		dialogoAgregarAutor = new DialogoAgregarAutor(ventana, this);
		
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case A_ABRIR_ADMINISTRADOR:
			dialogoAdministrador.setVisible(true);
			break;
		
		case A_ABRIR_USUARIO:
			dialogoUsuario.setVisible(true);
			break;
			
		case A_AGREGAR_LIBRO:
			dialogoAgregarLibro.setVisible(true);
			break;
			
		case A_AGREGAR_USUARIO:
			dialogoAgregarUsuario.setVisible(true);
			break;

		case A_AGREGAR_AUTOR:
			dialogoAgregarAutor.setVisible(true);
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Controlador c = new Controlador();
		
	}
}
