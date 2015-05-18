package presentacion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientas extends JToolBar{
	
	private static final long serialVersionUID = 1L;
	private JButton btnUsuario;
	private JButton btnAdministrador;
	private JButton btnEliminarUsuario;
	private JButton btnEliminarLibro;
	private JButton btnEliminarAutor;

	public BarraHerramientas(Controlador controlador) {
		btnUsuario = new JButton(createImageIcon(ConstantesGUI.I_ICONO_USUARIO));
		btnUsuario.addActionListener(controlador);
		btnUsuario.setActionCommand(Controlador.A_ABRIR_USUARIO);
		btnUsuario.setToolTipText(ConstantesGUI.T_MENU_ITEM_USUARIO);
		
		btnAdministrador = new JButton(createImageIcon(ConstantesGUI.I_ICONO_ADMINISTRADOR));
		btnAdministrador.setToolTipText(ConstantesGUI.T_MENU_ITEM_ADMINISTRADOR);
		btnAdministrador.addActionListener(controlador);
		btnAdministrador.setActionCommand(Controlador.A_ABRIR_ADMINISTRADOR);
		
		btnEliminarAutor = new JButton(createImageIcon(ConstantesGUI.I_ICONO_ELIMINAR_AUTOR));
		btnEliminarAutor.setToolTipText(ConstantesGUI.T_BTN_ELIMINAR_AUTOR);
		
		btnEliminarLibro = new JButton(createImageIcon(ConstantesGUI.I_ICONO_ELIMINAR_LIBRO));
		btnEliminarLibro.setToolTipText(ConstantesGUI.T_BTN_ELIMINAR_LIBRO);
		
		btnEliminarUsuario = new JButton(createImageIcon(ConstantesGUI.I_ICONO_ELIMINAR_USUARIO));
		btnEliminarUsuario.setToolTipText(ConstantesGUI.T_BTN_ELIMINAR_USUARIO);
		
		add(btnUsuario);
		add(btnAdministrador);
		add(btnEliminarAutor);
		add(btnEliminarLibro);
		add(btnEliminarUsuario);
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
