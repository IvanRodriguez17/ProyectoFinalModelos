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
public abstract class Movimientos {

    public void TemplateMethod(Lienzo lienzo) {
        cambiarSprites(lienzo, lienzo.personajes.get(0));
        modificarIncrementoPosicion(lienzo.personajes);
        cambiarDireccion(lienzo);
    }

    public abstract void cambiarSprites(Lienzo lienzo, Personaje personaje);

    public abstract void modificarIncrementoPosicion(ArrayList<Personaje> personajes);

    public abstract void cambiarDireccion(Lienzo lienzo);
}
