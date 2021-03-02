package entidades;

import java.util.ArrayList;

public class Casa {
	private Persona propietario;
	private double precio;
	private Direccion direccion;
	private ArrayList<Habitacion>  ListaHabitaciones;
	private ArrayList<Persona> ListaInquilinos;
	
	
	public Casa(Persona propietario, double precio,Direccion direccion, ArrayList<Habitacion> listaHabitaciones,
			ArrayList<Persona> listaInquilinos) {
		this.propietario = propietario;
		this.precio = precio;
		this.direccion = direccion;
		ListaHabitaciones = listaHabitaciones;
		ListaInquilinos = listaInquilinos;
	}


	public Persona getPropietario() {
		return propietario;
	}


	public double getPrecio() {
		return precio;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public ArrayList<Habitacion> getListaHabitaciones() {
		return ListaHabitaciones;
	}


	public ArrayList<Persona> getListaInquilinos() {
		return ListaInquilinos;
	}


	@Override
	public String toString() {
		return "Casa [propietario=" + propietario + ", precio=" + precio + ", direccion=" + direccion
				+ ", ListaHabitaciones=" + ListaHabitaciones + ", ListaInquilinos=" + ListaInquilinos + "]";
	}
	 
	public double calcularM2() {
		double sum = 0;
		for (Habitacion habitacion : ListaHabitaciones) {
			sum += habitacion.getM2();
		}
		return sum;
	}
}
