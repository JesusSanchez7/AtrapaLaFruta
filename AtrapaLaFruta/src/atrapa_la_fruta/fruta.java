package atrapa_la_fruta;

public class fruta extends elemento{

	protected String nombre;
	protected int puntos;
	
	public fruta(int posicionX, int posicionY, int ancho, int alto,int puntos, String nombre, char simbolo, String imagen) {
		super(posicionX, posicionY, ancho, alto, simbolo, imagen);
		this.nombre=nombre;
		this.puntos=puntos;
		}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void mostrarDatos() {
		System.out.println("Fruta" + this.nombre + "puntos:" +this.puntos);
		
	}
	
}
