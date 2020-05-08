package libreria;

public class Revista extends ObraLiteraria {
	private String nombre, autor;
	private double precio;
	private int numeroEdicion, año;
	public Revista(String nombre, String autor, double precio, int numeroEdicion, int año) {
		super(nombre,autor,precio);
		this.numeroEdicion = numeroEdicion;
		this.año = año;
	}
	public int getNumeroEdicion() {
		return numeroEdicion;
	}
	public int getAño() {
		return año;
	}
	@Override
	public boolean equals(Object obj) {
		Revista o= (Revista) obj;
		if ( (super.equals(obj)) && (this.año==o.getAño()) && (this.numeroEdicion==o.getNumeroEdicion()))
			return true;
		else
			return false;
	}
	


}
