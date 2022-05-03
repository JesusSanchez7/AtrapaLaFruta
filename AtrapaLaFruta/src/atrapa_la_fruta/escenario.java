package atrapa_la_fruta;

import java.util.ArrayList;

public class escenario {
	
	protected int ancho;
	protected int alto;
	protected personaje Personaje;
	protected ArrayList<elemento> elementos;
	private int contEfecto=0;
	private int contSaltar=0;
	
	public static void cleanScreen() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(Exception e) {
	}
	}
	
	public void mostrarElementoEscenario() {
		for (elemento Elemento: elementos) {
			Elemento.mostrarDatos();
		}
	}
	
	public Boolean jugando() {
		
	}
		
	
	public escenario(int ancho, int alto) {
		this.alto=alto;
		this.ancho=ancho;
		this.elementos=new ArrayList<elemento>();
		
	}
	public ArrayList<elemento> getelementos(){
	return elementos;
	}
	public void setelementos(ArrayList<elemento> elementos) {
		this.elementos=elementos;
	}
	

	public void agregarFruta(int posicionX, int posicionY, int ancho, int alto, int puntos, String nombre, char simbolo, String imagen){
		elementos.add(new fruta(posicionX, posicionY, ancho, alto, puntos, nombre, simbolo, imagen));
	}
	
	public void agregarFrutaDragon(int posicionX, int posicionY) {
		
	}
	
	public void agregarFrutaPlateada(int posicionX, int posicionY) {
		
	}
	
	public void agregarFrutaDorada(int posicionX, int posicionY) {
		
	}
	
	public void agregarFrutaHarryPotter(int posicionX, int posicionY) {
		
	}
	public void agregarFrutaVenenosa(int posicionX, int posicionY) {
		
	}
	
	public void agregarPersonaje() {
		Personaje=new personaje(1,1,10,10,1,'O',"Soy_un_personaje");
		elementos.add(Personaje);
		
		
	}
	
	public void crearEscenario1() {
		this.agregarPersonaje();
		this.agregarFrutaDragon(3,1);
		this.agregarFrutaPlateada(20,1);
	}
	public void crearEscenario2() {
		this.agregarPersonaje();
		this.agregarFrutaDorada(6,1);
		this.agregarFrutaVenenosa(23, 1);
	}
	public void crearEscenario3() {
		this.agregarPersonaje();
		this.agregarFrutaHarryPotter(7,1);
	}
	public void crearEscenario4() {
		this.agregarPersonaje();
		this.agregarFrutaDragon(4,4);
		this.agregarFrutaPlateada(19,4);
	}
	
	
}
