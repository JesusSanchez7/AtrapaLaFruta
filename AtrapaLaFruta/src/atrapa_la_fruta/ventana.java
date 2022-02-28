package atrapa_la_fruta;

import java.util.ArrayList;

public class ventana {

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
		

	}

