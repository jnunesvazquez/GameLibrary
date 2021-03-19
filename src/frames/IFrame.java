package frames;

import java.awt.Graphics;

/**
 * Interfaz en la que decidimos cada accion por fotograma
 */
public interface IFrame {

    /**
     * Metodo para actualizar
     */
    void update();

    /**
     * Metodo para dibujar
     * @param g Objeto a dibujar
     */
    void draw(Graphics g);
}
