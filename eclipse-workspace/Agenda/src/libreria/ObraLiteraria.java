package libreria;

public class ObraLiteraria {
	private String nombre, autor;
	private double precio;
	public ObraLiteraria(String nombre, String autor, double precio) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ObraLiteraria [nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + "]";
	}
	public double getPrecio(Cliente c) {
		return (precio -((precio*c.getDescuento())/100));
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getAutor() {
		return autor;
	}
	@Override
	public boolean equals(Object obj) {
		ObraLiteraria o= (ObraLiteraria) obj;
		if ((this.nombre==o.nombre) && (this.autor==o.autor)) //ACA NO SABIA SI DEJARLO ASI O REEMPLAZARLO POR (this.nombre==o.GETnombre) && (this.autor==o.GETautor)
			return true;
		else
			return false;
	}
	
	
	
}
