package presentacion;

import javax.swing.JButton;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientas extends JToolBar{
	
	private static final long serialVersionUID = 1L;
	private JButton btnUsuario;
	private JButton btnAdministrador;

	public BarraHerramientas(Controlador controlador) {
		btnUsuario = new JButton(); //Imagen del boton
		
		add(btnUsuario);
		
		btnAdministrador = new JButton(); //Imagen del boton
		btnAdministrador.addActionListener(controlador);
		btnAdministrador.setActionCommand(Controlador.A_ABRIR_ADMINISTRADOR);
		add(btnAdministrador);
	}

}
