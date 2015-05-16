package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.Controlador;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private BarraMenu barraMenu;
	private BarraHerramientas barraHerramientas;
	private JPanel panelPrincipal;
	private Controlador controlador;
	

	public Ventana(Controlador controlador) {
		
		setSize(800, 500); //Constantes
		setTitle("Software Libreria"); //Constantes
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		barraMenu = new BarraMenu(controlador);
		setJMenuBar(barraMenu);	
		
		barraHerramientas = new BarraHerramientas(controlador);
		add(barraHerramientas, BorderLayout.PAGE_START);
		
		panelPrincipal = new JPanel();
		add(panelPrincipal);
	}
	
	public static void main(String[] args) {
		Ventana v =  new Ventana(null);
		v.setVisible(true);
	}

}
