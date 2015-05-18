package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	private JTable tablaLibros;	


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
		add(panelLibro, BorderLayout.WEST);
		
//		panelAutor = new JPanel();
//		tablaAutor();
//		add(panelAutor, BorderLayout.CENTER);
		
		panelUsuario = new JPanel();
		tablaUsuarios();
		add(panelUsuario, BorderLayout.EAST);
	}
	
	public void tablaLibros(){
		modeloLibros = new DefaultTableModel(new String[]{"id", "genero", 
				"titulo", "autor", "descripcion", "valor"},0);
		tablaLibros = new JTable(modeloLibros);
		panelLibro.add(new JScrollPane(tablaLibros));
	}
	
	public void tablaUsuarios(){
		modeloLibros = new DefaultTableModel(new String[]{"id", "nombre", 
				"presupuesto"},0);
		tablaLibros = new JTable(modeloLibros);
		panelUsuario.add(new JScrollPane(tablaLibros));
	}
	
	public void tablaAutor(){
		modeloLibros = new DefaultTableModel(new String[]{"id", "nombre"},0);
		tablaLibros = new JTable(modeloLibros);
		panelAutor.add(new JScrollPane(tablaLibros));
	}
	

}
