/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoras;

import fabricas.ControladorFabrica;

/**
 *
 * @author ivanr
 */
public class ConstructoraConcreta extends ConstructoraAbstracta {

    public ConstructoraConcreta(String tipo) {
        fabrica = ControladorFabrica.getSingletonInstance(tipo);
        this.tipo = tipo;
    }

    @Override
    public void construirArma() {
        arma = fabrica.crearArma();
    }

    @Override
    public void construirEscudo() {
        escudo = fabrica.crearEscudo();
    }

    @Override
    public void construirMascota() {
        mascota = fabrica.crearMascota();
    }

    @Override
    public void construirImagenes() {
        imagenes1 = fabrica.crearImagenes();
        rutas = fabrica.crearRutas();
    }

    @Override
    public void construirPersonaje() {
        personaje = fabrica.crearPersonaje();
        personaje.setTipo(tipo);
        personaje.setArma(arma);
        personaje.setEscudo(escudo);
        personaje.setMascota(mascota);
        personaje.setImagenes(imagenes1);
        personaje.setRutasImg(rutas);
        personaje.setxPos(100);
        personaje.setyPos(200);
    }

}
