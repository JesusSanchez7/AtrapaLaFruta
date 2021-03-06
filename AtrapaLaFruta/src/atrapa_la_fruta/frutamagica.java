package atrapa_la_fruta;

public class frutamagica extends fruta {
	
	//Repito los atributos en las clases para evitar cualquier posible confusi?n con los de otras clases
	private String nombre;
	private int puntos;
	protected int posicionX;
	protected int posicionY;
	protected int alto;
	protected int ancho;
	protected String imagen;
	protected char simbolo;
	protected String efecto;

	//Constructor de frutas con efectos especiales
	public frutamagica(int posicionX, int posicionY, int ancho, int alto, char simbolo, String imagen) {
		super(posicionX, posicionY, ancho, alto, simbolo, imagen);
		switch(simbolo) {
		//Dependiendo de que fruta m?gica sea le damos unos valores y efecto:
		case 'G':
			this.nombre="Dorada";
			this.puntos=300;
			this.efecto="Correr";
			this.imagen="G";
			break;
		case 'H':
			this.nombre="Harry Potter";
			this.puntos=-50;
			this.efecto="Desaparecer";
			this.imagen="H";
			break;
		case 'V':
			this.nombre="Venenosa";
			this.puntos=-100;
			this.efecto="Ralentizar";
			this.imagen="V";
			break;
		}
	}

	//gets y sets
	public String getNombre() {
		return nombre;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public String getEfecto() {
		return efecto;
	}
	
	public void setEfecto(fruta Frut) {
		char simbol = Frut.getSimbolo();
		switch(simbol) {
		case 'G':
			this.efecto="Correr";
			break;
		case 'H':
			this.efecto="Desaparecer";
			break;
		case 'V':
			this.efecto="Ralentizar";
			break;
		}
	}
	
	//Modificamos el String
	public void mostrarDatos() {
		System.out.println("Fruta:"+ this.nombre + "Puntos:"+ this.puntos +"Efecto:" +this.efecto);
	}

}
