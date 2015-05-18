package presentacion;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

public class DialogoUsuario extends JDialog{

	private static final long serialVersionUID = 1L;
	private BarraHerramientasUsuario barraHerramientasUsuario;
	private JPanel pnlListaLibros;
	private JPanel pnlLibros;
	private JTable tablaLibro;
	private DefaultTableModel modeloLibro;
	
	public DialogoUsuario(Ventana ventana,Controlador controlador) {
		super(ventana);
		setModal(true);
		setResizable(false);
		setSize(ConstantesGUI.VENTANA_USUARIO_ANCHO, ConstantesGUI.VENTANA_USUARIO_ALTO);
		setIconImage(createImageIcon(ConstantesGUI.I_ICONO_USUARIO).getImage());
		setTitle(ConstantesGUI.T_MENU_ITEM_USUARIO);
		setLocationRelativeTo(null);
		
		barraHerramientasUsuario = new BarraHerramientasUsuario(controlador);
		add(barraHerramientasUsuario, BorderLayout.PAGE_START);
		
		pnlListaLibros = new JPanel();
		ventana.tablaLibros();
		pnlListaLibros.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                ConstantesGUI.T_TITULO_TABLA_LIBROS, TitledBorder.CENTER, TitledBorder.TOP));
		pnlListaLibros.add(new JScrollPane(ventana.tablaLibros));
		add(pnlListaLibros, BorderLayout.WEST);
		
		pnlLibros = new JPanel();
		tablaLibro();
		pnlLibros.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                ConstantesGUI.T_TITULO_TABLA_LIBRO_USUARIO, TitledBorder.CENTER, TitledBorder.TOP));
		add(pnlLibros, BorderLayout.CENTER);
	}
	
	public void tablaLibro(){
		modeloLibro = new DefaultTableModel(new String[]{ConstantesGUI.T_LB_ID, ConstantesGUI.T_LB_GENERO, 
				ConstantesGUI.T_LB_TITULO, ConstantesGUI.T_LB_AUTOR, ConstantesGUI.T_LB_DESCRIPCION, ConstantesGUI.T_LB_VALOR},0);
		tablaLibro = new JTable(modeloLibro);
		pnlLibros.add(new JScrollPane(tablaLibro));
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