/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import personajes.Arma;

/**
 *
 * @author ivanr
 */
public abstract class Personaje implements Cloneable{
    
    protected Arma arma;
    protected Escudo escudo;
    protected Mascota mascota;
    protected int xPos;
    protected int yPos;
    protected int velocidad;
    protected String tipo;
    
    protected ArrayList<Image> imagenes;
    protected ArrayList<String> rutasImg;
    protected int incremento;
    protected int cantidadSprites;
    protected int anchoSprite;
    protected int altoSprite;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public ArrayList<Image> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Image> imagenes) {
        this.imagenes = imagenes;
    }

    public ArrayList<String> getRutasImg() {
        return rutasImg;
    }

    public void setRutasImg(ArrayList<String> rutasImg) {
        this.rutasImg = rutasImg;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getCantidadSprites() {
        return cantidadSprites;
    }

    public void setCantidadSprites(int cantidadSprites) {
        this.cantidadSprites = cantidadSprites;
    }

    public int getAnchoSprite() {
        return anchoSprite;
    }

    public void setAnchoSprite(int anchoSprite) {
        this.anchoSprite = anchoSprite;
    }

    public int getAltoSprite() {
        return altoSprite;
    }

    public void setAltoSprite(int altoSprite) {
        this.altoSprite = altoSprite;
    }
    
    @Override
    public Personaje clone() {
        Personaje clonPersonaje = null;
        try {
            clonPersonaje = (Personaje) super.clone();
            clonPersonaje.setArma(arma);
            clonPersonaje.setEscudo(escudo);
            clonPersonaje.setMascota(mascota);
            clonPersonaje.setxPos(xPos);
            clonPersonaje.setyPos(yPos);
            clonPersonaje.setIncremento(incremento);
            clonPersonaje.setAltoSprite(altoSprite);
            clonPersonaje.setAnchoSprite(anchoSprite);
            clonPersonaje.setCantidadSprites(cantidadSprites);
            clonPersonaje.setRutasImg(rutasImg);
            clonPersonaje.setImagenes(imagenes);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonPersonaje;
    }
    
    public void update(){
        this.xPos = (800 + xPos)%800;
    }     
    
    public Rectangle getRect() {
		return new Rectangle(getxPos(),getyPos(),anchoSprite,altoSprite);
	}
}    
