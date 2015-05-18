package presentacion;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class DialogoAgregarAutor extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JPanel pnlCrear;
	private JLabel lbNombre;
	private JTextField txtNombre;
	private JButton btnCancelar;
	private JButton btnAgregar;
	
	public DialogoAgregarAutor(Ventana ventana,Controlador controlador) {
		super(ventana);
		setModal(true);
		setSize(ConstantesGUI.VENTANA_ADD_AUTOR_ANCHO, ConstantesGUI.VENTANA_ADD_AUTOR_ALTO);
		setTitle(ConstantesGUI.T_BTN_AGREGAR_AUTOR);
		setIconImage(createImageIcon(ConstantesGUI.I_ICONO_AGREGAR_AUTOR).getImage());
		setLocationRelativeTo(null);
		
		pnlCrear = new JPanel(new GridLayout(2, 2));
		lbNombre = new JLabel(ConstantesGUI.T_LB_NOMBRE);
		txtNombre = new JTextField();
		
		btnCancelar = new JButton(ConstantesGUI.T_BTN_CANCELAR);
		btnAgregar = new JButton(ConstantesGUI.T_BTN_AGREGAR);
		
		pnlCrear.add(lbNombre);
		pnlCrear.add(txtNombre);
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
