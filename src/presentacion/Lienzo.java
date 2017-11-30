/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import decorador.Destransformado;
import decorador.Transformado;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JOptionPane;
import movimientos.Movimientos;
import movimientos.MovimientosDerecha;
import movimientos.MovimientosIzquierda;
import personajes.Moneda;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class Lienzo extends Canvas {

    public ArrayList<Personaje> personajes;
    public Mapa mapa;
    Moneda moneda;
    public Image imageBuffered;
    public Graphics miG;
    public Lienzo lienzo;
    public Timer timer;
    public Image imagen;
    public boolean izquierda = false;
    public boolean derecha = true;
    public boolean transformacion = false;
    public Movimientos movimiento;

    public Lienzo(ArrayList<Personaje> personajes) {

        lienzo = this;
        this.personajes = personajes;
        imagen = personajes.get(0).getImagenes().get(0);
        mapa = new Mapa();
        moneda = new Moneda();
        timer = new Timer();
        imageBuffered = new BufferedImage(800, 300, BufferedImage.OPAQUE);
        timer.schedule(new Actualizador(), 0, 100);

        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    movimiento = new MovimientosDerecha();
                    movimiento.TemplateMethod(lienzo);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    movimiento = new MovimientosIzquierda();
                    movimiento.TemplateMethod(lienzo);
                }//CONTROL
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (transformacion == false) {
                        ArrayList<Transformado> transformados = new ArrayList<>();
                        for (int i = 0; i < personajes.size(); i++) {
                            transformados.add((new Transformado(personajes.get(i))));
                            personajes.remove(i);
                            personajes.add(i, transformados.get(i));
                            if (izquierda == true) {
                                imagen = personajes.get(0).getImagenes().get(1);
                            } else if (derecha = true) {
                                imagen = personajes.get(0).getImagenes().get(0);
                            }
                        }
                        transformacion = true;
                    } else if (transformacion == true) {
                        ArrayList<Destransformado> normales = new ArrayList<>();
                        for (int i = 0; i < personajes.size(); i++) {
                            normales.add((new Destransformado(personajes.get(i))));
                            personajes.remove(i);
                            personajes.add(i, normales.get(i));
                            if (izquierda == true) {
                                imagen = personajes.get(0).getImagenes().get(1);
                            } else if (derecha = true) {
                                imagen = personajes.get(0).getImagenes().get(0);
                            }
                        }
                        transformacion = false;
                    }

                }
            }
        });
        setFocusable(true);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        miG = imageBuffered.getGraphics();
        mapa.draw(miG);
        moneda.draw(g);
        miG = (Graphics2D) miG;
        for (int i = 0; i < personajes.size(); i++) {
            Personaje personaje = personajes.get(i);
            int mx = (personaje.getIncremento() % (personaje.getCantidadSprites() + 1)) * personaje.getAnchoSprite();
            int my = (personaje.getIncremento() / (personaje.getCantidadSprites() + 1)) * personaje.getAltoSprite();

            miG.drawImage(imagen, personaje.getxPos(), 300 - personaje.getAltoSprite(),
                    personaje.getxPos() + personaje.getAnchoSprite(), 300, mx, my,
                    mx + personaje.getAnchoSprite(), my + personaje.getAltoSprite(), this);

        }
        g.drawImage(imageBuffered, 0, 0, this);
        repaint();
    }

    private class Actualizador extends TimerTask {

        @Override
        
        public void run() {
            moneda.update();
            for (int i = 0; i < personajes.size(); i++) {
                Personaje personaje = personajes.get(i);
                personaje.update();
                if(personajes.get(i).getRect().intersects(moneda.getRect())) {
                    JOptionPane.showMessageDialog(null,"OH NO! PERDISTE... ADIOS");
                    System.exit(0);
                }
            }
            repaint();
        }

    };

}
