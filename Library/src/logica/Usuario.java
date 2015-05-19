package logica;

import java.util.ArrayList;

/**
 * @author Wilber
 */
public class Usuario {
	private int id;
	private String nombre;
	private double presupuesto;
	private ArrayList<Libro> listaLibros;

	public Usuario(int id, String nombre, double presupuesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

}
