package atrapa_la_fruta;

import java.util.TimerTask;

public class TimerJuego extends TimerTask {     
    private final ventana ventana1;
    TimerJuego ( ventana ventana1 ) {       
      this.ventana1 = ventana1;     
    }
    public void run() {
       //Método que será ejecutado cada 200 milisegundos
      // Para cancelar el timer podéis utilizar: "cancel();" 
    } 
}


