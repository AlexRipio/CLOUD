package javabean;

import java.util.ArrayList;

public class MainJavaBean {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Son Goku");
		System.out.println(p1.getEdad());
		
		p1.setEdad(-45);
		//p1.edad = -23;
		//String direccion = "Calle diamente 58 Madrid 28051";
		int cp = 02345;// estan en base octal
		System.out.println(cp);
		int hex = 0xFF34EA; // estan en base hexadecimal
		int bin = 0b101;//esta en base binaria
		
		Persona p2 = null;
		//siempre que intenteis acceder a algun metodo de un puntero
		//o referencia a null, dara un null pointer exception
		//p1.getDireccion().setCp("28051");
		//los objetos cuando se crean sus primitivos tienen valor
		//de 0, y sus referencias tienen valor de "null"
		Direccion d1 = new Direccion();
		p1.setDireccion(d1);
		d1.setCp("28224");
		System.out.println(p1.getDireccion().getCp());
		
		d1 = new Direccion();
		d1.setCp("23567");
		System.out.println(p1.getDireccion().getCp());
		p1.getDireccion().setCp("12345");
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p3 = new Persona();
		listaPersonas.add(p3);
		p3.setNombre("Krilin");
		
		System.out.println(listaPersonas.get(0).getNombre());
		
		String s1 = "Felix";
		String s2 = "Felix";
		String s3 = new String("Felix");
		
		if(s1 == s2) {
			System.out.println("Son iguales");
		}
		
		if(s1.equals(s3)) {
			
		}
		
		s2 = "Ana";
		s1 = "Ana";
	}

}
