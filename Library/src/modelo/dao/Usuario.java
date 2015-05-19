package modelo.dao;

import java.util.ArrayList;

/**
 * @author Wilber
 */
public class Usuario {
	private int id;
	private static int idusuario;
	private String nombre;
	private double presupuesto;
	private static int consecutivo;
	private ArrayList<Libro> listaLibros;

	public Usuario(String nombre, double presupuesto) {
		super();
		this.id = idusuario;
		idusuario++;
		this.id = consecutivo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		consecutivo++;
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
	@Override
	public String toString() {

		return nombre + ":" + "\npresupesto :" + presupuesto;
	}

}
