package presentacion;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controlador.Controlador;

public class BarraMenu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	private JMenu menuArchivo;
	private JMenuItem jItemUsuario;
	private JMenuItem jItemAdministrador;
	private JMenuItem jItemSalir;
	private JMenu menuAyuda;
	private JMenuItem jItemAcercaDe;

	public BarraMenu(Controlador controlador) {

		menuArchivo = new JMenu(ConstantesGUI.T_MENU_ARCHIVO);
		
		menuArchivo.addSeparator();
		jItemUsuario = new JMenuItem(ConstantesGUI.T_MENU_ITEM_USUARIO);
		menuArchivo.add(jItemUsuario);
		
		jItemAdministrador = new JMenuItem(ConstantesGUI.T_MENU_ITEM_ADMINISTRADOR);
		menuArchivo.add(jItemAdministrador);
		
		menuArchivo.addSeparator();
		jItemSalir = new JMenuItem(ConstantesGUI.T_MENU_ITEM_SALIR);
		menuArchivo.add(jItemSalir);
		
		add(menuArchivo);
		
		menuAyuda = new JMenu(ConstantesGUI.T_MENU_AYUDA);
		menuAyuda.addSeparator();
		jItemAcercaDe = new JMenuItem(ConstantesGUI.T_MENU_ITEM_ACERCA_DE);
		menuAyuda.add(jItemAcercaDe);
		
		add(menuAyuda);

	}

}
