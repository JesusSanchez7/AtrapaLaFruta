package atrapa_la_fruta;

import java.util.ArrayList;

public class personaje extends elemento {
	
	protected int velocidad;
	protected int desaparecer;
	protected int contadorDesaparecer;
	protected int contadorSaltar;
	protected ArrayList<fruta> frutas;
	
	

	public personaje(int posicionX, int posicionY, int ancho, int alto, int velocidad, char simbolo, String imagen) {
		super(posicionX, posicionY, ancho, alto, simbolo, imagen);
		this.velocidad=velocidad;
		this.frutas=new ArrayList<fruta>();
		
	}
	
	
	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void setAparecer() {
		
	}
	
	public void mostrarDatos() {
		System.out.println("Personaje" + "Posición"+this.posicionX +","+this.posicionY);
	}


	protected void saltar() {
		
	}
	protected void avanzar() {
		this.posicionX += this.velocidad;
		if(this.contadorDesaparecer>0) {
			if(this.contadorDesaparecer<18) {
				this.contadorDesaparecer++;
			}
			else {
				this.contadorDesaparecer=0;
				this.setAparecer();
			}
		}
		if(this.contadorSaltar>0) {
			if(this.contadorSaltar<3) {
				this.contadorSaltar++;
			}
			else {
				this.contadorSaltar=0;
				this.bajar();
			}
		}
	}
	public void cogerFruta() {
		
	}
	public void choca() {
		
	}
	public void mostrarFrutas() {
		System.out.println("Fruta" + fruta.nombre )
		
	}
}
