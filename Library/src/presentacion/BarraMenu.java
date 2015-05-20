package presentacion;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controlador.Controlador;

public class BarraMenu extends JMenuBar {

	private static final long serialVersionUID = 1L;
	private final JMenu menuArchivo;
	private final JMenuItem jItemUsuario;
	private final JMenuItem jItemAdministrador;
	private final JMenuItem jItemSalir;
	private final JMenu menuAyuda;
	private final JMenuItem jItemAcercaDe;

	private final JMenuItem JitemCrearUsuario;

	public BarraMenu(Controlador controlador) {

		menuArchivo = new JMenu(ConstantesGUI.T_MENU_ARCHIVO);

		menuArchivo.addSeparator();
		jItemUsuario = new JMenuItem(ConstantesGUI.T_MENU_ITEM_USUARIO,
				createImageIcon(ConstantesGUI.I_ICONO_USUARIO));
		jItemUsuario.addActionListener(controlador);
		jItemUsuario.setActionCommand(Controlador.A_ABRIR_USUARIO);
		menuArchivo.add(jItemUsuario);

		menuArchivo.addSeparator();
		JitemCrearUsuario = new JMenuItem(ConstantesGUI.T_MENU_CREAR_USUARIO,
				createImageIcon(ConstantesGUI.I_ICONO_USUARIO));
		JitemCrearUsuario.addActionListener(controlador);
		JitemCrearUsuario.setActionCommand(Controlador.A_AGREGAR_USUARIO);
		menuArchivo.add(JitemCrearUsuario);

		jItemAdministrador = new JMenuItem(
				ConstantesGUI.T_MENU_ITEM_ADMINISTRADOR,
				createImageIcon(ConstantesGUI.I_ICONO_ADMINISTRADOR));
		jItemAdministrador.addActionListener(controlador);
		jItemAdministrador.setActionCommand(Controlador.A_ABRIR_ADMINISTRADOR);
		menuArchivo.add(jItemAdministrador);

		menuArchivo.addSeparator();
		jItemSalir = new JMenuItem(ConstantesGUI.T_MENU_ITEM_SALIR,
				createImageIcon(ConstantesGUI.I_ICONO_SALIR));
		menuArchivo.add(jItemSalir);

		add(menuArchivo);

		menuAyuda = new JMenu(ConstantesGUI.T_MENU_AYUDA);
		menuAyuda.addSeparator();
		jItemAcercaDe = new JMenuItem(ConstantesGUI.T_MENU_ITEM_ACERCA_DE);
		menuAyuda.add(jItemAcercaDe);

		add(menuAyuda);

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
