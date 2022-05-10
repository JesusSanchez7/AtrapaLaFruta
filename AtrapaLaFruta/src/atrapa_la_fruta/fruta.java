package atrapa_la_fruta;

public class fruta extends elemento{

	protected String nombre;
	protected int puntos;
	protected int ancho;
	protected int alto;
	protected int posicionX;
	protected int posicionY;
	protected String imagen;
	protected char simbolo;
	
	//Constructor de fruta (con un switch para los distintos tipos)
	public fruta(int posicionX, int posicionY, int ancho, int alto, char simbolo, String imagen) {
		super(posicionX, posicionY, ancho, alto, simbolo, imagen);
		switch(simbolo) {
		//Dependiendo de que fruta queramos generar le daremos un nombre y puntos diferentes (en vez de hacer distintos constructores)
		case 'D':
			this.nombre="DRAGÓN";
			this.puntos=100;
			this.imagen="D";
			break;
		case 'G':
			this.nombre="DORADA";
			this.puntos=300;
			this.imagen="G";
			break;
		case 'P':
			this.nombre="PLATEADA";
			this.puntos=200;
			this.imagen="P";
			break;
		case 'H':
			this.nombre="HARRY POTTER";
			this.puntos=-50;
			this.imagen="H";
			break;
		case 'V':
			this.nombre="VENENOSA";
			this.puntos=-100;
			this.imagen="V";
			break;
		}	
	}

	//gets
	public String getNombre() {
		return nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	
	//set(para cuando haya que decir que fruta hemos cogido)
	public void setFruta(char simbolo) {
		switch(simbolo) {
		case 'D':
			this.nombre="DRAGON";
			this.puntos=100;
			this.imagen="D";
			break;
		case 'G':
			this.nombre="DORADA";
			this.puntos=300;
			this.imagen="G";
			break;
		case 'P':
			this.nombre="PLATEADA";
			this.puntos=200;
			this.imagen="P";
			break;
		case 'H':
			this.nombre="HARRY POTTER";
			this.puntos=-50;
			this.imagen="H";
			break;
		case 'V':
			this.nombre="VENENOSA";
			this.puntos=-100;
			this.imagen="V";
			break;
		}
	}

	//Generacion de las distintas frutas:
	public void agregarFrutaDragon(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaDorada(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaPlateada(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaHarryPotter(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaVenenosa(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	
	public void mostrarDatos() {
		System.out.println("Fruta" + this.nombre + "puntos:" +this.puntos);	
	}
	
	
	
	
}
