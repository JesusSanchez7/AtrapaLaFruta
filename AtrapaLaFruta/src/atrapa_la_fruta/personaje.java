package atrapa_la_fruta;

public class personaje extends elemento {
	
	protected int velocidad;
	
	

	public personaje(int posicionX, int posicionY, int ancho, int alto, int velocidad, char simbolo, String imagen) {
		super(posicionX, posicionY, ancho, alto, simbolo, imagen);
		this.velocidad=velocidad;
		
	}
	
	
	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void mostrarDatos() {
		System.out.println("Personaje" + "Posición"+this.posicionX +","+this.posicionY);
	}


	protected void saltar() {
		
	}
	protected void avanzar() {
		
	}
	protected void cogerFruta() {
		
	}
	protected void choca() {
		
	}
	protected void mostrarFrutas() {
		
	}
}
