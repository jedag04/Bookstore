package presentacion;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class DialogoAgregarLibro extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JPanel pnlCrear;
	private JLabel lbGenero;
	private JLabel lbTitulo;
	private JLabel lbAutor;
	private JLabel lbDescripcion;
	private JLabel lbValor;
	private JTextField txtGenero;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtDescripcion;
	private JTextField txtValor;
	private JButton btnCancelar;
	private JButton btnAgregar;
	
	public DialogoAgregarLibro(Ventana ventana,Controlador controlador) {
		super(ventana);
		setModal(true);
		setSize(300, 300);
		setTitle(ConstantesGUI.T_BTN_AGREGAR_LIBRO);
		setLocationRelativeTo(null);
		
		pnlCrear = new JPanel(new GridLayout(6, 2));
		lbGenero = new JLabel("Genero"); //Constantes
		txtGenero = new JTextField();
		lbTitulo = new JLabel("Titulo"); //Constantes
		txtTitulo = new JTextField();
		lbAutor = new JLabel("Autor"); //Constantes
		txtAutor = new JTextField();
		lbDescripcion= new JLabel("Descripcion");  //Constantes
		txtDescripcion = new JTextField();
		lbValor = new JLabel("Valor"); //Constantes
		txtValor = new JTextField();
		
		btnCancelar = new JButton("Cancelar");  //Constantes
		btnAgregar = new JButton("Agregar");  //Constantes
		
		pnlCrear.add(lbGenero);
		pnlCrear.add(txtGenero);
		pnlCrear.add(lbTitulo);
		pnlCrear.add(txtTitulo);
		pnlCrear.add(lbAutor);
		pnlCrear.add(txtAutor);
		pnlCrear.add(lbDescripcion);
		pnlCrear.add(txtDescripcion);
		pnlCrear.add(lbValor);
		pnlCrear.add(txtValor);
		pnlCrear.add(btnCancelar);
		pnlCrear.add(btnAgregar);
		
		add(pnlCrear);
	}

}
