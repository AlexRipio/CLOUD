package entidades;

public class Habitacion {
	private double m2;
	private String TipoHabitacion;
	public Habitacion(double m2, String tipoHabitacion) {
		this.m2 = m2;
		TipoHabitacion = tipoHabitacion;
	}
	public double getM2() {
		return m2;
	}
	public String getTipoHabitacion() {
		return TipoHabitacion;
	}
	@Override
	public String toString() {
		return "Habitacion [m2=" + m2 + ", TipoHabitacion=" + TipoHabitacion + "]";
	}
	
}
