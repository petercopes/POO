package libreria;
import persona.Persona;
import java.util.ArrayList;
import java.util.Iterator;

import alarma.Sensor;
public class Cliente extends Persona {
	private String direccion;
	private ArrayList<String> autoresFav,generosFav;
	private ArrayList<ObraLiteraria> compras;
	private int descuento;
	private boolean exigente;
	
	public Cliente(String nombre, int dni, String apellido, String direccion, ArrayList<String> autoresFav, ArrayList<String> generosFav,
			ArrayList<ObraLiteraria> compras,int descuento,boolean exigente) {
		super(nombre,dni,apellido);
		this.direccion = direccion;
		this.autoresFav = autoresFav;
		this.generosFav = generosFav;
		
		this.descuento= descuento;
		this.exigente=exigente;
		if (compras==null) {
			this.compras = new ArrayList<ObraLiteraria>();
		}
		else {
			this.compras = compras;
		}
	}
	
	public int getDescuento() {
		return descuento;
	}
	/*
	public void setDescuento(int descuento) {				HABIA AUTOGENERADO ESTE SETTER PERO LO COMENTO PARA LIMITARME AL EJERCICIO. 
		this.descuento = descuento;
	}
	*/
	public boolean yaCompro(ObraLiteraria o) {
		return this.compras.contains(o);
	}
	public void comprar(ObraLiteraria o) {
		this.compras.add(o);
		
	}
	
	public boolean leGustara(Libro o) {
		boolean cond = false;
		Iterator<String> it = autoresFav.iterator();
		while ((it.hasNext()) && (!cond)) {					// EN UN PRINCIPIO PENSE EN HACERLO CON OBRALITERARIA DE PARAMETRO PERO DESISTI PQ
			if (it.next().equalsIgnoreCase(o.getAutor())) { // EL CRITERIO DE EXIGENTE TENIA EN CUENTA EL ATRIBUTO GENERO Y ESTE ES PROPIO DE LIBRO
				cond = true;								
			}
		}
		if (!exigente) {
			return cond;
		} else {
			Iterator<String> it2 = generosFav.iterator();

			it = generosFav.iterator();
			cond = false;
			while (it.hasNext() && !cond) {
				if (it.next().equals(o.getGenero())) {
					cond = true;
				}
			}
			return cond;
		}
	}
}
