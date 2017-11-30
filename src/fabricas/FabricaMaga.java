/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import personajes.Arma;
import personajes.ArmaCiborg;
import personajes.ArmaMaga;
import personajes.Escudo;
import personajes.EscudoCiborg;
import personajes.EscudoMaga;
import personajes.Maga;
import personajes.Mascota;
import personajes.MascotaCiborg;
import personajes.MascotaMaga;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class FabricaMaga extends FabricaAbstracta{

    @Override
    public Arma crearArma() {
        arma = new ArmaMaga();
        arma.setDaño(45);
        arma.setNombre("anillo de poder");
        arma.setRuta("src//Recursos//armaMaga.png");
        return arma;
    }

    @Override
    public Escudo crearEscudo() {
        escudo = new EscudoMaga();
        escudo.setDefensa(20);
        escudo.setNombre("hechizo de proteccion");
        escudo.setRuta("src//Recursos//escudoMaga.png");
        return escudo;
    }

    @Override
    public Mascota crearMascota() {
        mascota = new MascotaMaga();
        mascota.setHabilidad("Recuperacion de vida");
        mascota.setNombre("Hija del bosque");
        mascota.setRuta("src//Recursos//mascotaMaga.png");
        return mascota;
    }

    @Override
    public ArrayList<Image> crearImagenes() {
        imagenes1 = new ArrayList<>();
        imagenes1.add(new ImageIcon("src//Recursos//spriteMagaDer.png").getImage());
        imagenes1.add(new ImageIcon("src//Recursos//spriteMagaIzq.png").getImage());
        return imagenes1;
    }

    @Override
    public ArrayList<String> crearRutas() {
        rutas = new ArrayList<>();
        rutas.add("src//Recursos//spriteMagaDer.png");
        rutas.add("src//Recursos//spriteMagaIzq.png");
        return rutas;
    }

    @Override
    public Personaje crearPersonaje() {
        personaje = new Maga();
        return personaje;
    }
    
}
