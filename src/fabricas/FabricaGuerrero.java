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
import personajes.ArmaGuerrero;
import personajes.Escudo;
import personajes.EscudoGuerrero;
import personajes.Guerrero;
import personajes.Mascota;
import personajes.MascotaGuerrero;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class FabricaGuerrero extends FabricaAbstracta{
@Override
    public Arma crearArma() {
        arma = new ArmaGuerrero();
        arma.setDaño(45);
        arma.setNombre("espada de triunfo");
        arma.setRuta("src//Recursos//armaGuerrero.png");
        return arma;
    }

    @Override
    public Escudo crearEscudo() {
        escudo = new EscudoGuerrero();
        escudo.setDefensa(20);
        escudo.setNombre("escudo dorado");
        escudo.setRuta("src//Recursos//escudoGuerrero.PNG");
        return escudo;
    }

    @Override
    public Mascota crearMascota() {
        mascota = new MascotaGuerrero();
        mascota.setHabilidad("Velocidad de movimiento");
        mascota.setNombre("chocobo de guerra");
        mascota.setRuta("src//Recursos//mascotaGuerrero.png");
        return mascota;
    }

    @Override
    public ArrayList<Image> crearImagenes() {
        imagenes1 = new ArrayList<>();
        imagenes1.add(new ImageIcon("src//Recursos//spriteGuerreroDer.png").getImage());
        imagenes1.add(new ImageIcon("src//Recursos//spriteGuerreroIzq.png").getImage());
        return imagenes1;
    }

    @Override
    public ArrayList<String> crearRutas() {
        rutas = new ArrayList<>();
        rutas.add("src//Recursos//spriteGuerreroDer.png");
        rutas.add("src//Recursos//spriteGuerreroIzq.png");
        return rutas;
    }

    @Override
    public Personaje crearPersonaje() {
        personaje = new Guerrero();
        return personaje;
    }
}
