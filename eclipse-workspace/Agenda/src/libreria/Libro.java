package libreria;

public class Libro extends ObraLiteraria{

	private String nombre, autor,resumen,genero;
	private double precio;
	private int cantPag;
	public Libro(String nombre, String autor, String resumen, String genero, double precio, int cantPag) {
		super(nombre,autor,precio);
		this.resumen = resumen;
		this.genero = genero;
		this.cantPag = cantPag;
	}								//YA PARA ESTE NO HICE LOS GETTERS/SETTERS.
	
	public String getGenero() {
		return genero;
	}
	
}
