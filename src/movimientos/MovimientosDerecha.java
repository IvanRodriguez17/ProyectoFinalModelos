/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimientos;

import java.util.ArrayList;
import personajes.Personaje;
import presentacion.Lienzo;

/**
 *
 * @author ivanr
 */
public class MovimientosDerecha extends Movimientos{

    @Override
    public void cambiarSprites(Lienzo lienzo, Personaje personaje) {
        lienzo.imagen = personaje.getImagenes().get(0);
    }

    @Override
    public void modificarIncrementoPosicion(ArrayList<Personaje> personajes) {
        Personaje personaje;
        for (int i = 0; i < personajes.size(); i++) {
			personaje = personajes.get(i);
			personaje.setIncremento(personaje.getIncremento() + 1);
			personaje.setxPos(personaje.getxPos() + personaje.getVelocidad());
			if (personaje.getIncremento() > personaje.getCantidadSprites()) {
				personaje.setIncremento(0);
			}

		}
    }

    @Override
    public void cambiarDireccion(Lienzo lienzo) {
        lienzo.derecha = true;
        lienzo.izquierda = false;
    }
    
}
