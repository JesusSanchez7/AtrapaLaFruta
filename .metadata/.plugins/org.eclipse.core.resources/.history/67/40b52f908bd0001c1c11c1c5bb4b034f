package atrapa_la_fruta;

import java.util.TimerTask;

//Métodos aportados por el enunciado.

public class TimerJuego extends TimerTask{
	
	//aportado en el enunciado
    private final ventana Consola;
  
    public TimerJuego(ventana Consola){
    	this.Consola=Consola;
    }
    
    //Comprueba si debe seguir ejecutandose, y si no se cierra.
    public void run() {
    	if(Consola.jugando()==false) {
    		cancel();
    		System.exit(0);
    		escenario.cleanScreen();
    	}
    	else {
    	}
    	//Método que será ejecutado cada 200 milisegundos
      // Para cancelar el timer podéis utilizar: "cancel();" 
    } 
    

}