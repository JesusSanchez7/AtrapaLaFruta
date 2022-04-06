package atrapa_la_fruta;

import java.util.ArrayList;

public class escenario {
	
	protected int ancho;
	protected int alto;
	protected personaje Personaje;
	protected ArrayList<elemento> elementos;
	
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
	

	protected void agregarFruta(int posicionX, int posicionY, int ancho, int alto, int puntos, String nombre, char simbolo, String imagen){
		elementos.add(new fruta(posicionX, posicionY, ancho, alto, puntos, nombre, simbolo, imagen));
	}
	protected void agregarPersonaje() {
		Personaje=new personaje(1,1,10,10,1,'O',"Soy_un_personaje");
		elementos.add(Personaje);
		
		
	}
	
	public void crearEscenario1() {
	}
	public void crearEscenario2() {
	}
	public void crearEscenario3() {
	}
	public void crearEscenario4() {
	}
	
}
