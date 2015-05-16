package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.DialogoAdministrador;
import presentacion.DialogoUsuario;
import presentacion.Ventana;
import logica.GestorAutor;

public class Controlador implements ActionListener{
	
	private GestorAutor gestorAutor;
	private Ventana ventana;
	private DialogoUsuario dialogoUsuario;
	private DialogoAdministrador dialogoAdministrador;


	public Controlador() {
		gestorAutor = new GestorAutor();
		ventana = new Ventana(this);
		dialogoUsuario = new DialogoUsuario();
		dialogoAdministrador = new DialogoAdministrador();
		ventana.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	

}
