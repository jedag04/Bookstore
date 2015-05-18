package presentacion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientasAdministrador extends JToolBar {

	private static final long serialVersionUID = 1L;
	private JButton btnAgregarUsuario;
	private JButton btnAgregarLibro;
	private JButton btnAgregarAutor;
	

	public BarraHerramientasAdministrador(Controlador controlador) {
		btnAgregarAutor = new JButton(createImageIcon(ConstantesGUI.I_ICONO_AGREGAR_AUTOR));
		btnAgregarAutor.addActionListener(controlador);
		btnAgregarAutor.setActionCommand(Controlador.A_AGREGAR_AUTOR);
		btnAgregarAutor.setToolTipText(ConstantesGUI.T_BTN_AGREGAR_AUTOR);
		
		btnAgregarLibro = new JButton(createImageIcon(ConstantesGUI.I_ICONO_AGREGAR_LIBRO));
		btnAgregarLibro.setToolTipText(ConstantesGUI.T_BTN_AGREGAR_LIBRO);
		btnAgregarLibro.addActionListener(controlador);
		btnAgregarLibro.setActionCommand(Controlador.A_AGREGAR_LIBRO);
		
		btnAgregarUsuario = new JButton(createImageIcon(ConstantesGUI.I_ICONO_AGREGAR_USUARIO));
		btnAgregarUsuario.addActionListener(controlador);
		btnAgregarUsuario.setActionCommand(Controlador.A_AGREGAR_USUARIO);
		btnAgregarUsuario.setToolTipText(ConstantesGUI.T_BTN_AGREGAR_USUARIO);
		
		add(btnAgregarAutor);
		add(btnAgregarLibro);
		add(btnAgregarUsuario);

	}
	
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file" + path);
			return null;
		}
	}
}
