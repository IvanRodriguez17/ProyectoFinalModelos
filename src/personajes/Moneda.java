/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author ivanr
 */
public class Moneda {

    Image imagen = new ImageIcon("src//recursos//moneda.png").getImage();
    private int posx = 0;
    private int posy = 0;
    private int rotation = 10;
    private int velx = 0;
    private int vely = 0;

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public int getVelx() {
        return velx;
    }

    public void setVelx(int velx) {
        this.velx = velx;
    }

    public int getVely() {
        return vely;
    }

    public void setVely(int vely) {
        this.vely = vely;
    }

    public Moneda() {
        Random r = new Random();
        posx = r.nextInt(800);
        posy = r.nextInt(300);

        velx = -10 + r.nextInt(30);
        vely = -10 + r.nextInt(30);

        rotation = -15 + r.nextInt(20);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int spriteHeight = imagen.getHeight(null);
        int spriteWidth = imagen.getWidth(null);

        AffineTransform affineTransform = new AffineTransform();
        affineTransform.rotate(Math.toRadians(rotation), posx + spriteWidth / 2, posy + spriteHeight / 2);
        affineTransform.translate(posx, posy);

        g2d.drawImage(imagen, affineTransform, null);
    }

    public void update() {
        Random r = new Random();
        rotation += r.nextInt(20);
        posx += velx;
        posy += vely;

        posx = (800 + posx) % 800;
        posy = (300 + posy) % 300;
    }

    public Rectangle getRect() {
        int spriteHeight = imagen.getHeight(null);
        int spriteWidth = imagen.getWidth(null);
        return new Rectangle(getPosx(), getPosy(), spriteWidth, spriteHeight);
    }

}
