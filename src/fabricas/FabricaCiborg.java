/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import personajes.Arma;
import personajes.ArmaCiborg;
import personajes.Escudo;
import personajes.EscudoCiborg;
import personajes.Mascota;
import personajes.MascotaCiborg;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import personajes.Ciborg;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class FabricaCiborg extends FabricaAbstracta{

    @Override
    public Arma crearArma() {
        arma = new ArmaCiborg();
        arma.setDaño(45);
        arma.setNombre("espada omega");
        arma.setRuta("src//Recursos//armaCiborg.png");
        return arma;
    }

    @Override
    public Escudo crearEscudo() {
        escudo = new EscudoCiborg();
        escudo.setDefensa(20);
        escudo.setNombre("esfera azul");
        escudo.setRuta("src//Recursos//escudoCiborg.png");
        return escudo;
    }

    @Override
    public Mascota crearMascota() {
        mascota = new MascotaCiborg();
        mascota.setHabilidad("Vision aumentada");
        mascota.setNombre("espirtu de tierra");
        mascota.setRuta("src//Recursos//mascotaCiborg.png");
        return mascota;
    }

    @Override
    public ArrayList<Image> crearImagenes() {
        imagenes1 = new ArrayList<>();
        imagenes1.add(new ImageIcon("src//Recursos//spriteCiborgDer.png").getImage());
        imagenes1.add(new ImageIcon("src//Recursos//spriteCiborgIzq.png").getImage());
        return imagenes1;
    }

    @Override
    public ArrayList<String> crearRutas() {
        rutas = new ArrayList<>();
        rutas.add("src//Recursos//spriteCiborgDer.png");
        rutas.add("src//Recursos//spriteCiborgIzq.png");
        return rutas;
    }

    @Override
    public Personaje crearPersonaje() {
        personaje = new Ciborg();
        return personaje;
    }
    
    
}
