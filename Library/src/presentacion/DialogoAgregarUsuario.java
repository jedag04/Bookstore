package presentacion;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.dao.GestorUsuario;
import modelo.dao.Usuario;
import controlador.Controlador;

public class DialogoAgregarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel pnlCrear;
	private final JLabel lbNombre;
	private final JLabel lbPresupuesto;
	private final JTextField txtNombre;
	private final JTextField txtPresupuesto;
	private final JButton btnCancelar;
	private final JButton btnAgregar;

	public DialogoAgregarUsuario(Ventana ventana, Controlador controlador) {
		super(ventana);
		setModal(true);
		setSize(ConstantesGUI.VENTANA_ADD_USER_ANCHO,
				ConstantesGUI.VENTANA_ADD_USER_ALTO);
		setIconImage(createImageIcon(ConstantesGUI.I_ICONO_AGREGAR_USUARIO)
				.getImage());
		setTitle(ConstantesGUI.T_BTN_AGREGAR_USUARIO);
		setLocationRelativeTo(null);

		pnlCrear = new JPanel(new GridLayout(3, 2));
		lbNombre = new JLabel(ConstantesGUI.T_LB_NOMBRE);
		txtNombre = new JTextField();
		lbPresupuesto = new JLabel(ConstantesGUI.T_LB_PRESUPUESTO);
		txtPresupuesto = new JTextField();

		btnCancelar = new JButton(ConstantesGUI.T_BTN_CANCELAR);

		btnAgregar = new JButton(ConstantesGUI.T_BTN_AGREGAR);
		btnAgregar.addActionListener(controlador);
		btnAgregar.setActionCommand(Controlador.A_BTN_AGREGAR_USUARIO);

		pnlCrear.add(lbNombre);
		pnlCrear.add(txtNombre);
		pnlCrear.add(lbPresupuesto);
		pnlCrear.add(txtPresupuesto);
		pnlCrear.add(btnCancelar);
		pnlCrear.add(btnAgregar);

		add(pnlCrear);
	}

	public Usuario crearUsuario() {

		return GestorUsuario.crearUsuario(txtNombre.getText(),
				txtPresupuesto.getText());
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
