package presentacion;

import javax.swing.JDialog;

import controlador.Controlador;

public class DialogoAgregarLibro extends JDialog{
	
	private static final long serialVersionUID = 1L;

	public DialogoAgregarLibro(Ventana ventana,Controlador controlador) {
		super(ventana);
		setModal(true);
		setSize(300, 300);
		setTitle(ConstantesGUI.T_BTN_AGREGAR_LIBRO);
		setLocationRelativeTo(null);
	}

}
