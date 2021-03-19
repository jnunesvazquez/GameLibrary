package constants;

/**
 * Clase cronometro para contabilizar el tiempo de aparicion de objetos
 */
public class Timer {
    private long delta, lastTime, time;                   //delta acumulara el tiempo que lleva lastTime
    private boolean running;

    /**
     * Constructor
     */
    public Timer() {
        delta = 0;
        lastTime = 0;
        running = false;
    }

    /**
     * Metodo que establece nuestro hilo de objetos
     * @param time  Tiempo del hilo
     */
    public void run(long time){
        running = true;
        this.time = time;
    }

    /**
     * Metodo para actualizar el hilo
     */
    public void update(){
        if (running){
            delta += System.currentTimeMillis() - lastTime;     //Definimos el tiempo en milisegundos
        }
        if (delta >= time){
            running = false;
            delta = 0;
        }
        lastTime = System.currentTimeMillis();
    }

    /**
     * Getter
     * @return runnig
     */
    public boolean isRunning(){
            return running;
    }
}

