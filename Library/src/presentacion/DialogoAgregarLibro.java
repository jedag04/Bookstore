package presentacion;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
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
		setSize(ConstantesGUI.VENTANA_ADD_LIBRO_ANCHO, ConstantesGUI.VENTANA_ADD_LIBRO_ALTO);
		setTitle(ConstantesGUI.T_BTN_AGREGAR_LIBRO);
		setIconImage(createImageIcon(ConstantesGUI.I_ICONO_AGREGAR_LIBRO).getImage());
		setLocationRelativeTo(null);
		
		pnlCrear = new JPanel(new GridLayout(6, 2));
		lbGenero = new JLabel(ConstantesGUI.T_LB_GENERO);
		txtGenero = new JTextField();
		lbTitulo = new JLabel(ConstantesGUI.T_LB_TITULO);
		txtTitulo = new JTextField();
		lbAutor = new JLabel(ConstantesGUI.T_LB_AUTOR);
		txtAutor = new JTextField();
		lbDescripcion= new JLabel(ConstantesGUI.T_LB_DESCRIPCION);
		txtDescripcion = new JTextField();
		lbValor = new JLabel(ConstantesGUI.T_LB_VALOR);
		txtValor = new JTextField();
		
		btnCancelar = new JButton(ConstantesGUI.T_BTN_CANCELAR);
		btnAgregar = new JButton(ConstantesGUI.T_BTN_AGREGAR);
		
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
