package libreria;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class main {

	public static void main(String[] args) {
		Libro l1= new Libro("psicologia", "jorge", "malo", "psic", 200, 100);
		Libro l2 = new Libro("psico2", "marcos", "bueno", "psico", 200, 200);
		Libro l3 = new Libro("matematica1", "jorge", "Bueno", "matem", 200, 100);
		ArrayList<String> aut = new ArrayList<String>(Arrays.asList("jorge","marcos","Juan"));
		ArrayList<String> gen = new ArrayList<String>(Arrays.asList("psico","lengua","matem"));
		Cliente c1 = new Cliente("javier", 305564, "dia", "fdf", aut, gen, null, 15, true);
		Cliente c2 = new Cliente("martin", 1, "sd", "sdas", aut, null, null, 0, false);
		System.out.println(c1.leGustara(l1));
		System.out.println(c1.leGustara(l2));
		System.out.println(c2.leGustara(l1));
		System.out.println(l1.getPrecio(c1));
		c2.comprar(l1);
		System.out.println(c2.yaCompro(l1));
		
	}

}
