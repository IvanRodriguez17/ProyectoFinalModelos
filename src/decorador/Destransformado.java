/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

import javax.swing.ImageIcon;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class Destransformado extends Decorador{

    public Destransformado(Personaje personaje) {
        super(personaje);
        cambioImagenes();
    }

    @Override
    public void cambioImagenes() {
        String spriteDerecha = this.getRutasImg().get(0);
        String spriteIzquierda = this.getRutasImg().get(1);
        spriteDerecha = spriteDerecha.replaceAll("Trans.png", ".png");
        spriteIzquierda = spriteIzquierda.replaceAll("Trans.png", ".png");
        this.getImagenes().remove(0);
        this.getImagenes().add(0, new ImageIcon(spriteDerecha).getImage());
        this.getImagenes().remove(1);
        this.getImagenes().add(1, new ImageIcon(spriteIzquierda).getImage());
    }
}
