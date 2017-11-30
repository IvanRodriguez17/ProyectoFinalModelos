/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipos;

import personajes.Personaje;
import java.util.ArrayList;

/**
 *
 * @author ivanr
 */
public class GestorPrototipos {

    private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    public ArrayList<Personaje> crearClonaciones(int cantidad, Personaje personaje) throws CloneNotSupportedException {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
            Personaje character = personaje.clone();
            character.setxPos((int) (Math.random() * (800)));
            character.setyPos(300);
            personajes.add(character);
        }
        return personajes;
    }
}
