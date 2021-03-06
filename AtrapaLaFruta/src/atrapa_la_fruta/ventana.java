package atrapa_la_fruta;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class ventana {
	
	//Creacion de objetos para la clase ventana:
	Scanner scanner = new Scanner(System.in); //necesario para detectar el teclado
	public escenario Escenario;
	private final int ancho=60;
	private final int alto=60;
	private boolean movimiento=false;
	
	//Constructor de la clase que genera un escenario nuevo:
	public ventana() {
		this.Escenario=new escenario(ancho,alto); 
	}
	
	//genera el men? para elegir nivel en pantalla:
	public void crearMen?() {
		System.out.println("Elija un escenario de juego:");
		System.out.println("Escenario 1");
		System.out.println("Escenario 2");
		System.out.println("Escenario 3");
		System.out.println("Escenario 4");
		System.out.println("Elija un escenario con las teclas 1 2 3 4");
		System.out.println("Para saltar pulse la tecla enter. Intente coger todas las frutas que pueda, pero cuidado con las frutas venenosas!");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			this.Escenario.crearEscenario1();
			break;
		case 2:
			this.Escenario.crearEscenario2();
			break;
		case 3:
			this.Escenario.crearEscenario3();
			break;
		case 4:
			this.Escenario.crearEscenario4();
			break;
		default:
			System.out.println("Introduce un n?mero del 1 al 4!"); //en caso que no haya introducido un n?mero del 1 al 4
			break;
		}
		//Copiada del enunciado(de momento da error):
		Timer timer = new Timer();
		timer.schedule(new TimerJuego(this), 0, 200);
		
		//A?adimos un scanner que ser? el que detecte el boton de salto
		scanner.nextLine();{
			while(true) {
				//Haciendo esto, arreglamos el error que hab?a que no funcionaba el salto. (No entiendo porque la tecla es enter y tampoco porque as? si funciona, me dijo como solucionarlo un compa?ero)
				String entrada = scanner.nextLine();
				if(entrada.equals("")) {
				this.Escenario.salto();	
				}
			}				
			}
	}
	

	//Copiada del enunciado:
	public void dibujarEscenario(ArrayList<elemento> elementos, int WIDTH, int HEIGHT) { 
		try {
			 char[][] escenarioTextual = new char[WIDTH][HEIGHT];  
			  for (int i = 0; i < WIDTH; i++) {     
			    for (int j = 0; j < HEIGHT; j++) {           
			      if (j==0) {              
			        escenarioTextual[i][j] = '#';           
			      }else {              
			        escenarioTextual[i][j] = ' ';          
			       }        
			    }     
			  }     
			  for (elemento elemento: elementos) {      
			    escenarioTextual[elemento.getPosicionX()][elemento.getPosicionY()] = elemento.getSimbolo();
			  }     
			  for (int y =HEIGHT - 1; y >= 0; y--) {        
			    for (int x = 0; x < WIDTH; x++) {           
			      if (y==0) {              
			        System.out.printf("#");           
			      }else {
			        System.out.printf(Character.toString(escenarioTextual[x][y]));           
			      }        
			    }        
			    System.out.printf("\n");     
			  }  
		}
		//hacemos el catch de la interrupci?n que salta al terminar(se sale del l?mite) y llamamos a mostrarDatos..
		  catch(ArrayIndexOutOfBoundsException e) {
			  this.Escenario.Personaje.mostrarDatos();
		  }
		}
	
	//M?todo que verifica que estamos jugando para darle movimiento al personaje
	public boolean jugando() {
		boolean verificar = true;
		if(verificar == true) {
			this.movimiento=true;
			//Inicializa el escenario
			dibujarEscenario(this.Escenario.getElementos(), ancho, alto);
			if(this.movimiento) {
				this.Escenario.jugando();
				this.Escenario.Personaje.avanzar();
				}
			}
		return verificar;
	}
	

	
		
	
}


