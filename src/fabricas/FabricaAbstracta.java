/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import personajes.Arma;
import personajes.Escudo;
import personajes.Mascota;
import java.awt.Image;
import java.util.ArrayList;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public abstract class FabricaAbstracta {
    
    protected Arma arma;
    protected Escudo escudo;
    protected Mascota mascota;
    protected ArrayList<Image> imagenes1;
    protected ArrayList<String> rutas;
    protected Personaje personaje;
    
    public abstract Arma crearArma();
    public abstract Escudo crearEscudo();
    public abstract Mascota crearMascota();
    public abstract ArrayList<Image> crearImagenes();
    public abstract ArrayList<String> crearRutas();
    public abstract Personaje crearPersonaje();
}
