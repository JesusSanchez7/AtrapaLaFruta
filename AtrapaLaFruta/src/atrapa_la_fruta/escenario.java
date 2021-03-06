package atrapa_la_fruta;

import java.util.ArrayList;
import java.io.IOException;

public class escenario {
	
	protected int ancho;
	protected int alto;
	protected personaje Personaje;
	protected ArrayList<elemento> elementos;
	
	//Constructor de escenario:
	public escenario(int ancho, int alto) {
		this.ancho=ancho;
		this.alto=alto;
		this.elementos=new ArrayList<elemento>();
	}
	
	//Sets y gets
	public int getAncho() {
		return ancho;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public ArrayList<elemento> getElementos(){
		return elementos;
	}
	
	public void setAncho(int ancho) {
		this.ancho=ancho;
	}
	
	public void setAlto(int alto) {
		this.alto=alto;
	}
	
	public void setElementos(ArrayList<elemento> elementos) {
		this.elementos=elementos;
	}
	
	
	//M?todo que se ejecuta mientras el programa esta corriendo:
	public Boolean jugando() {
		ArrayList<elemento> elementos2 = new ArrayList<elemento>();
		elementos2 = this.getElementos();
		for(int i = 0; i<elementos2.size(); i++) {
			if(i > 0) {
				elemento e = this.elementos.get(i);
				this.Personaje.HaTocado(e);
	            }
		  }
		return true;
	}
	
	

	//M?todo para agregar una fruta al escenario
	//el nombre y los puntos se a?aden dependiendo del tipo de fruta que sea
	public void agregarFruta(int posicionX, int posicionY, int ancho, int alto, char simbolo, String imagen){
		fruta FRUTA=new fruta(posicionX, posicionY, ancho, alto, simbolo, imagen);
		switch(simbolo) {
		case 'D':
		FRUTA.agregarFrutaDorada(posicionX, posicionY);
		break;
		case 'G':
		FRUTA.agregarFrutaDragon(posicionX, posicionY);
		break;
		case 'P':
		FRUTA.agregarFrutaPlateada(posicionX, posicionY);
		break;
		case 'H':
		FRUTA.agregarFrutaHarryPotter(posicionX, posicionY);
		break;
		case 'V':
		FRUTA.agregarFrutaVenenosa(posicionX, posicionY);
		break;
	}
		//una vez hemos a?adido al escenario el tipo de fruta, la a?adimos al array de elementos.
		elementos.add(FRUTA);
	}
	
	
	//Creador de personaje(X, Y, ancho, alto, velocidad, s?mbolo, imagen):
	public void agregarPersonaje(int posicionX,int posicionY,int ancho,int alto,int velocidad) {
		this.Personaje=new personaje(posicionX,posicionY,ancho,alto,velocidad);
		elementos.add(Personaje);
	}
	
	//M?todo que va a permitir hacer que el personaje salte llamando al metodo saltar:
	public void salto() {
		this.Personaje.saltar();
	}
	
	//Creacion de los distintos escenarios
	public void crearEscenario1() {
		this.agregarPersonaje(1, 1, 10, 10, 2);
		this.agregarFruta(15, 1, 1, 1, 'D', "D");
		this.agregarFruta(33, 1, 1, 1, 'P', "P");
	}
	
	public void crearEscenario2() {
		this.agregarPersonaje(1, 1, 10, 10, 2);
		this.agregarFruta(13, 1, 1, 1, 'V', "V");
		this.agregarFruta(53, 1, 1, 1, 'G', "G");
	}
	
	public void crearEscenario3() {
		this.agregarPersonaje(1, 1, 10, 10, 2);
		this.agregarFruta(20, 1, 1, 1, 'H', "H");
	}
			
	public void crearEscenario4() {
		this.agregarPersonaje(1, 1, 10, 10, 2);
		//No se por que hay posiciones en las que no coge las frutas(p.e en 14 no coge D)
		this.agregarFruta(13, 3, 1, 1, 'D', "D");
		this.agregarFruta(51, 3, 1, 1, 'P', "P");
	}
}
