package entidades;

public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private int cp;
	public Direccion(String tipoVia, String nombreVia, int cp) {
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public int getCp() {
		return cp;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cp=" + cp + "]";
	}
	
	
}

