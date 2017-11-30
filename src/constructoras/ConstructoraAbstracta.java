/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoras;

import fabricas.FabricaAbstracta;
import personajes.Arma;
import personajes.Escudo;
import personajes.Mascota;
import personajes.Personaje;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author ivanr
 */
public abstract class ConstructoraAbstracta {
    
    protected FabricaAbstracta fabrica;
    protected Personaje personaje;
    protected Arma arma;
    protected Escudo escudo;
    protected Mascota mascota;
    protected ArrayList<Image> imagenes1;
    protected ArrayList<String> rutas;
    protected String tipo;
    
    public Personaje getPersonaje(){
        return this.personaje;
    }
    
    public abstract void construirArma();
    public abstract void construirEscudo();
    public abstract void construirMascota();
    public abstract void construirImagenes();
    public abstract void construirPersonaje();
    
}
