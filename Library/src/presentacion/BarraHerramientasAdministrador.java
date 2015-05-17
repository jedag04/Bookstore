package presentacion;

import javax.swing.JButton;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientasAdministrador extends JToolBar {

	private static final long serialVersionUID = 1L;
	private JButton btnAgregarUsuario;
	private JButton btnEliminarUsuario;
	private JButton btnAgregarLibro;
	private JButton btnEliminarLibro;
	private JButton btnAgregarAutor;
	private JButton btnEliminarAutor;

	public BarraHerramientasAdministrador(Controlador controlador) {
		btnAgregarAutor = new JButton(); //Agregar imagen
		btnEliminarAutor = new JButton(); //Agregar imagen
		btnAgregarLibro = new JButton(); //Agregar imagen
		btnAgregarLibro.setToolTipText(ConstantesGUI.T_BTN_AGREGAR_LIBRO);
		btnAgregarLibro.addActionListener(controlador);
		btnAgregarLibro.setActionCommand(Controlador.A_AGREGAR_LIBRO);
		btnEliminarLibro = new JButton(); //Agregar imagen
		btnAgregarUsuario = new JButton(); //Agregar imagen
		btnEliminarUsuario = new JButton(); //Agregar imagen

		
		add(btnAgregarAutor);
		add(btnEliminarAutor);
		add(btnAgregarLibro);
		add(btnEliminarLibro);
		add(btnAgregarUsuario);
		add(btnEliminarUsuario);
	}
}
