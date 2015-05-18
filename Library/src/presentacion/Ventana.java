package presentacion;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private BarraMenu barraMenu;
	private BarraHerramientas barraHerramientas;
	private JPanel panelLibro;
	private JPanel panelUsuario;
	private JPanel panelAutor;
	private DefaultTableModel modeloLibros;
	protected JTable tablaLibros;	
	private JTable tablaUsuarios;
	private DefaultTableModel modeloUsuarios;

	public Ventana(Controlador controlador) {
		
		setSize(ConstantesGUI.VENTANA_ANCHO, ConstantesGUI.VENTANA_ALTO);
		setTitle(ConstantesGUI.T_TITULO_VENTANA);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		barraMenu = new BarraMenu(controlador);
		setJMenuBar(barraMenu);	
		
		barraHerramientas = new BarraHerramientas(controlador);
		add(barraHerramientas, BorderLayout.PAGE_START);
		
		panelLibro = new JPanel();
		tablaLibros();
		panelLibro.add(new JScrollPane(tablaLibros));
		add(panelLibro, BorderLayout.WEST);
		
//		panelAutor = new JPanel();
//		tablaAutor();
//		add(panelAutor, BorderLayout.CENTER);
		
		panelUsuario = new JPanel();
		tablaUsuarios();
		add(panelUsuario, BorderLayout.EAST);
	}
	
	public void tablaLibros(){
		modeloLibros = new DefaultTableModel(new String[]{ConstantesGUI.T_LB_ID, ConstantesGUI.T_LB_GENERO, 
				ConstantesGUI.T_LB_TITULO, ConstantesGUI.T_LB_AUTOR, ConstantesGUI.T_LB_DESCRIPCION, ConstantesGUI.T_LB_VALOR},0);
		tablaLibros = new JTable(modeloLibros);
		panelLibro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                ConstantesGUI.T_TITULO_TABLA_LIBROS, TitledBorder.CENTER, TitledBorder.TOP));
	}
	
	public void tablaUsuarios(){
		modeloUsuarios = new DefaultTableModel(new String[]{ConstantesGUI.T_LB_ID, ConstantesGUI.T_LB_NOMBRE, 
				ConstantesGUI.T_LB_PRESUPUESTO},0);
		tablaUsuarios = new JTable(modeloUsuarios);
		panelUsuario.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                ConstantesGUI.T_TITULO_TABLA_USUARIO, TitledBorder.CENTER, TitledBorder.TOP));
		panelUsuario.add(new JScrollPane(tablaUsuarios));
	}
	
	public void tablaAutor(){
		modeloLibros = new DefaultTableModel(new String[]{ConstantesGUI.T_LB_ID, ConstantesGUI.T_LB_NOMBRE},0);
		tablaLibros = new JTable(modeloLibros);
		panelAutor.add(new JScrollPane(tablaLibros));
	}
}