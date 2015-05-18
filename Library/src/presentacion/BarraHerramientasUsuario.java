package presentacion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientasUsuario extends JToolBar{

	private static final long serialVersionUID = 1L;
	private JButton btnComprarLibro;
	private JButton btnEliminarLibro;

	public BarraHerramientasUsuario(Controlador controlador) {
		btnComprarLibro = new JButton(createImageIcon(ConstantesGUI.I_ICONO_COMPRAR));
//		btnComprarLibro.addActionListener(controlador);
//		btnComprarLibro.setActionCommand(Controlador.A_AGREGAR_AUTOR);
		btnComprarLibro.setToolTipText(ConstantesGUI.T_LB_COMPRAR);
		
		btnEliminarLibro = new JButton(createImageIcon(ConstantesGUI.I_ICONO_ELIMINAR));
		btnEliminarLibro.setToolTipText(ConstantesGUI.T_BTN_ELIMINAR_LIBRO);
//		btnEliminarLibro.addActionListener(controlador);
//		btnEliminarLibro.setActionCommand(Controlador.A_AGREGAR_LIBRO);
		
		add(btnComprarLibro);
		add(btnEliminarLibro);

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
