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
import personajes.ArmaElfo;
import personajes.Elfo;
import personajes.Escudo;
import personajes.EscudoElfo;
import personajes.Mascota;
import personajes.MascotaElfo;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class FabricaElfo extends FabricaAbstracta{
    
    @Override
    public Arma crearArma() {
        arma = new ArmaElfo();
        arma.setDaño(45);
        arma.setNombre("Arco de Luz");
        arma.setRuta("src//Recursos//armaElfo.png");
        return arma;
    }

    @Override
    public Escudo crearEscudo() {
        escudo = new EscudoElfo();
        escudo.setDefensa(20);
        escudo.setNombre("Escudo del bosque");
        escudo.setRuta("src//Recursos//escudoElfo.png");
        return escudo;
    }

    @Override
    public Mascota crearMascota() {
        mascota = new MascotaElfo();
        mascota.setHabilidad("Proteccion contra el fuego");
        mascota.setNombre("Espiritu Guardian");
        mascota.setRuta("src//Recursos//mascotaElfo.png");
        return mascota;
    }

    @Override
    public ArrayList<Image> crearImagenes() {
        imagenes1 = new ArrayList<>();
        imagenes1.add(new ImageIcon("src//Recursos//spriteElfoDer.png").getImage());
        imagenes1.add(new ImageIcon("src//Recursos//spriteElfoIzq.png").getImage());
        return imagenes1;
    }

    @Override
    public ArrayList<String> crearRutas() {
        rutas = new ArrayList<>();
        rutas.add("src//Recursos//spriteElfoDer.png");
        rutas.add("src//Recursos//spriteElfoIzq.png");
        return rutas;
    }

    @Override
    public Personaje crearPersonaje() {
        personaje = new Elfo();
        return personaje;
    }
}
