package logica;

/**
 * @author Wilber
 */

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private String descrripcion;
	private double valor;

	public Libro(String titulo, String autor, String descrripcion,
			double valor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.descrripcion = descrripcion;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescrripcion() {
		return descrripcion;
	}

	public void setDescrripcion(String descrripcion) {
		this.descrripcion = descrripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
