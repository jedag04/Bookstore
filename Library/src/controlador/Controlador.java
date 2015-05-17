package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.DialogoAdministrador;
import presentacion.DialogoAgregarLibro;
import presentacion.Ventana;

public class Controlador implements ActionListener{
	
	public static final String A_ABRIR_ADMINISTRADOR = "ABRIR_ADMINISTRADOR";
	public static final String A_AGREGAR_LIBRO = "AGREGAR_LIBRO";
	private Ventana ventana;
	private DialogoAdministrador dialogoAdministrador;
	private DialogoAgregarLibro dialogoAgregarLibro;


	public Controlador() {
		ventana = new Ventana(this);
		dialogoAdministrador = new DialogoAdministrador(ventana,this);
		dialogoAgregarLibro = new DialogoAgregarLibro(ventana, this);
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case A_ABRIR_ADMINISTRADOR:
			dialogoAdministrador.setVisible(true);
			break;
			
		case A_AGREGAR_LIBRO:
			dialogoAgregarLibro.setVisible(true);
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
