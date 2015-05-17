package presentacion;

import java.awt.BorderLayout;

import javax.swing.JDialog;

import controlador.Controlador;

public class DialogoAdministrador extends JDialog{

	private static final long serialVersionUID = 1L;
	private BarraHerramientasAdministrador barraHerramientasAdministrador;
	
	public DialogoAdministrador(Ventana ventana,Controlador controlador) {
		super(ventana);
		setModal(true);
		setSize(500, 500);
		setTitle(ConstantesGUI.T_MENU_ITEM_ADMINISTRADOR);
		setLocationRelativeTo(null);
		barraHerramientasAdministrador = new BarraHerramientasAdministrador(controlador);
		add(barraHerramientasAdministrador, BorderLayout.PAGE_START);
		
	}
	
}