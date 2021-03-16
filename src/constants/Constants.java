package constants;

public class Constants {

    // Dimensiones de la ventana

    public static final int WIDTH = 1000;                   //Alto de la ventana
    public static final int HEIGHT = 600;                   //Ancho de la ventana

    // Atributos del jugador

    public static final int FIRERATE = 300;                 //Velocidad de disparo del jugador
    public static final double DELTAANGLE = 0.1;            //Angulo de rotacion del jugador
    public static final double ACC = 0.2;                   //Constante de aceleracion del jugador
    public static final double PLAYER_MAX_VEL = 7.0;        //Velocidad maxima del jugador

    // Atributos de los laseres

    public static final double LASER_VEL = 15.0;            //Velocidad del laser

    //Atributos del meteorito

    public static final double METEOR_VEL = 2.0;            //Velocidad inicial del meteorito
    public static final int METEOR_SCORE = 20;              //Ountos por destruir meteorito

    //Reaparecer

    public static final long FLICKER_TIME=200;              //Tiempo de invencivilidad mientras reapareces
    public static final long SPAWNING_TIME=3000;            //Tiempo antes de reaparecer
    public static final long GAME_OVER_TIME = 3000;         //Tiempo del game over hasta la vuelta al menu

    //Texto del menu

    public static final String PLAY = "PLAY";
    public static final String EXIT = "EXIT";

}
