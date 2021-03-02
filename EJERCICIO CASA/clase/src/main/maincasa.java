package main;

import java.util.ArrayList;

import entidades.Casa;
import entidades.Direccion;
import entidades.Habitacion;
import entidades.Persona;

public class maincasa {
	public static void main(String[] args) {

		Persona p1 = new Persona("Jorge", 25, "50023345F");
		Persona p2 = new Persona("Lucas", 27, "50023345J");
		Persona p3 = new Persona("Maria", 28, "50023345O");

		Direccion d1 = new Direccion("Calle", "Arturo Soria", 28036);

		Habitacion h1 = new Habitacion(15, "Dormitorio");
		Habitacion h2 = new Habitacion(20, "Dormitorio");
		Habitacion h3 = new Habitacion(18, "Dormitorio");

		ArrayList<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(h1);
		habitaciones.add(h2);
		habitaciones.add(h3);

		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		Casa casa = new Casa(p1, 150000, d1, habitaciones, personas);
		
		System.out.println("Tamaño de la casa: " + casa.calcularM2());
		
		System.out.println(casa);
	}
}
