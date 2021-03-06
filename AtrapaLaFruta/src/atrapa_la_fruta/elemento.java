package atrapa_la_fruta;

public abstract class elemento {
	
	protected int posicionX;
	protected int posicionY;
	protected int ancho;
	protected int alto;
	protected char simbolo;
	protected String imagen;
	
	//Constructor de elemento:
	public elemento(int posicionX, int posicionY, int ancho, int alto, char simbolo, String imagen) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.ancho = ancho;
		this.alto = alto;
		this.simbolo = simbolo;
		this.imagen = imagen;
	}
	
	//gets y sets
	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	//M?todo de la clase abstracta que usaremos en diferentes casos
	protected void mostrarDatos() {
		
	}
}
