package atrapa_la_fruta;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class ventana {
	
	Scanner scanner = new Scanner(System.in);
	
	public escenario Escenario = new escenario(40,40) ;
	
	public void crearMenú() {
		System.out.println("Elija un escenario de juego:");
		System.out.println("Escenario 1");
		System.out.println("Escenario 2");
		System.out.println("Escenario 3");
		System.out.println("Escenario 4");
		
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
			
		
		}
	}
	

	public void dibujarEscenario(ArrayList<elemento> elementos, int WIDTH, int HEIGHT) {     
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
		      escenarioTextual[elemento.posicionX][elemento.posicionY] = elemento.getSimbolo();         
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
	
	  Timer timer = new Timer();
	    timer.schedule(new TimerJuego(this), 0, 200);
   
		public Boolean jugando() {
			Boolean resultado= this.Escenario.jugando();
			if(resultado) {
				dibujarEscenario(this.Escenario.getelementos(), WIDTH, HEIGHT);
			}
			return resultado;
		}

	}


