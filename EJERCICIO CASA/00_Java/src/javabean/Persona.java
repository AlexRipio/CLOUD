package javabean;

//Vamos a hacer esta clase JavaBean
//Un clase con estructura JavaBean es una clase
//que tiene sus atributos con visibilidad private
//y tiene metodos accesores y modificadores public

//Es una estructura ampliamente utilizada en frameworks java
//como puede ser Spring
public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	//Persona tiene una relacion de composion con Direccion
	//Si responde a la pregunta "has a" "tiene un" es esta relacion
	//este tipo de relacion va como atributo de clase
	private Direccion direccion;

	
	//que hace java con los constructores
	//si no creais constructor java crea el constructor
	//por defecto
	public Persona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad >= 0)
			this.edad = edad;
		else
			this.edad = 0;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
}
