package atrapa_la_fruta;

import java.util.ArrayList;

public class personaje extends elemento {
	
	protected int velocidad;
	protected int desaparecer;
	protected int contadorDesaparecer=0;
	protected int contadorSaltar=0;
	protected ArrayList<fruta> frutas;
	private int contador=0;
	
	
    //constructor de personaje
	public personaje(int posicionX, int posicionY, int ancho, int alto, int velocidad) {
		super(posicionX, posicionY, ancho, alto, 'O', "O");
		this.velocidad=velocidad;
		this.frutas=new ArrayList<fruta>();
	}

	//sets y gets
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	//M?todo que hace que el personaje sea visible:
	public void Aparecer() {
		this.setImagen("O");
		this.setSimbolo('O');
	}
	
	//M?todo que hace que el personaje sea invisible:
	public void Desaparecer() {
		this.setImagen(" ");
		this.setSimbolo(' ');
	}

	//accion de salto:
	protected void saltar() {
		this.setPosicionY(3);
		this.contadorSaltar++;
	}
	
	//accion de bajar del salto
	protected void bajar() {
		this.setPosicionY(1);
	}
	
	//M?todo que aumenta la velocidad:
	public void acelera() {
		this.setVelocidad(this.velocidad+1);
	}
	
	//M?todo que frena la velocidad
	public void frena() {
		this.setVelocidad(this.velocidad-1);
	}
	
	//M?todo que va a generar el movimiento del personaje (visto del profesor y modificado):
	protected void avanzar() {
		this.posicionX += this.velocidad; //movimiento horizontal constante
		//Comprobamos si hay efecto de desaparecer:
		if(this.contadorDesaparecer>0) {
			if(this.contadorDesaparecer<20) {
				this.contadorDesaparecer++;
				this.Desaparecer();
			}
			//Si no hay o se ha acabado el efecto:
			else {
				this.contadorDesaparecer=0;
				this.Aparecer();
			}
		}
		//Comprobamos si el personaje esta saltando
		if(this.contadorSaltar>0) {
			if(this.contadorSaltar<3) {
				this.contadorSaltar++;
			}
			//si no esta saltando o el salto ha acabado:
			else {
				this.contadorSaltar=0;
				this.bajar();
			}
		}
	}
	
	//M?todo que se ejecuta cuando cogemos una fruta:
	public void cogeFruta(fruta Fr) {
		char simb = Fr.getSimbolo();
		if((simb == 'D' || simb == 'G' || simb == 'P' || simb == 'H' || simb == 'V')) {
			frutas.add(Fr); //a?adimos la fruta al array de frutas obtenidas.
		}
	}
	//M?todo para ver si el personaje ha tocado una fruta para cogerla:
	public boolean HaTocado(elemento b) {
		//Si la posicion del personaje es la misma que la fruta(si la toca):
		if(this.posicionX==b.getPosicionX() && this.posicionY==b.getPosicionY()) {
			//Crramos una fruta con las caracteristicas de la fruta que hemos cogido)
			fruta F = new fruta (b.getPosicionX(),b.getPosicionY(),b.getAlto(),b.getAncho(),b.getSimbolo(),b.getImagen());
			//Vemos que tipo de fruta es con el metodo que hemos creado
			F.setFruta(F.getSimbolo());
			//llamamos a cogeFruta(la a?ade al array de frutas obtenidas)
			this.cogeFruta(F);
			//una vez la hemos cogido, la hacemos desaparecer del escenario:
			b.setPosicionX(0);
			b.setPosicionY(0);
			b.setAlto(0);
			b.setAncho(0);
			//finalmente, viendo el tipo de fruta, hacemos funcionar los efectos:
			char simbolo = b.getSimbolo();
			switch(simbolo) {
			case 'G':
				this.acelera();
				break;
			case 'V':
				this.frena();
				break;
			case 'H':
				this.contadorDesaparecer=1;
			}
			return true;
		}
		return false;
	}
	
	//Modificamos el m?todo mostrarDatos para hacer que cuente los puntos obtenidos en la partida:
	public void mostrarDatos() {
		this.contador++;
		if(contador==1) {
			int Score=0;
		for(fruta f : frutas) {
			Score += f.getPuntos();//Hacemos que por cada fruta que hayamos cogido se vayan sumando sus puntos
			if(f.getSimbolo() == 'G' || f.getSimbolo() == 'H' || f.getSimbolo() == 'V') {
				frutamagica F = new frutamagica(f.getPosicionX(),f.getPosicionY(),f.getAlto(),f.getAncho(),f.getSimbolo(),f.getImagen());
				//Comprobamos si la fruta se trata de una fruta m?gica, y si lo es veremos su nombre y efecto:
				F.setEfecto(F);
				F.mostrarDatos();
			}
			//Si no es m?gica, tambien vemos sus datos sin tener que ver su efecto:
			else if(f.getSimbolo() == 'D' || f.getSimbolo() == 'P') {
				f.mostrarDatos();
			}
		}
		System.out.println("Puntuaci?n:" +Score);
	}
	}
	
	
	
}
