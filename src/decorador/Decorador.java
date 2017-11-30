/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public abstract class Decorador extends Personaje {

	protected Personaje personaje;
	
	public Decorador(Personaje personaje) {
		this.altoSprite = personaje.getAltoSprite();
		this.anchoSprite = personaje.getAnchoSprite();
		this.cantidadSprites = personaje.getCantidadSprites();
                this.incremento = personaje.getIncremento();
                this.velocidad = personaje.getVelocidad();
                this.arma = personaje.getArma();
                this.escudo = personaje.getEscudo();
                this.mascota = personaje.getMascota();
                this.imagenes = personaje.getImagenes();
                this.rutasImg = personaje.getRutasImg();
                this.tipo = personaje.getTipo();
                this.xPos = personaje.getxPos();
                this.yPos = personaje.getyPos();
	}
        
        public abstract void cambioImagenes();
}
