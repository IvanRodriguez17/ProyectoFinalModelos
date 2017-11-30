/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ivanr
 */
public class Mapa {
    
    Image imagen = new ImageIcon("src//recursos//mapa.jpg").getImage();
    
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
}
