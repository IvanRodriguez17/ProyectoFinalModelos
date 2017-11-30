/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ivanr
 */
public class VentanaSeleccion extends JFrame implements ActionListener{
    
    private JPanel contenido;
    private JLabel fondo;
    private JButton btnElfo;
    private JButton btnGuerrero;
    private JButton btnMaga;
    private JButton btnCiborg;
    private JLabel lblSeleccion;
    private Image imagenFondo;
    private Image imagenElfo;
    private Image imagenGuerrero;
    private Image imagenMaga;
    private Image imagenCiborg;
    private ImageIcon propiedadesFondo;
    private ImageIcon propiedadesElfo;
    private ImageIcon propiedadesGuerrero;
    private ImageIcon propiedadesMaga;
    private ImageIcon propiedadesCiborg;
    
    public VentanaSeleccion(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CATALOGO PERSONAJES V.1");
        
        contenido =  new JPanel();
        contenido.setBounds(0, 0, 750, 350);
        contenido.setBackground(Color.BLACK);
        contenido.setLayout(null);
        add(contenido);
        
        lblSeleccion = new JLabel("Seleccione un personaje");
        lblSeleccion.setBounds(150, 50, 450, 50);
        lblSeleccion.setFont(new Font("Fillmore", Font.BOLD, 28));
        lblSeleccion.setForeground(Color.WHITE);
        contenido.add(lblSeleccion);
        
        imagenElfo = new ImageIcon("src//recursos//elfo.png").getImage();
        btnElfo = new JButton("elfo");
        btnElfo.setBounds(50, 100, 120, 170); 
        btnElfo.setBorderPainted(true);
        btnElfo.setContentAreaFilled(false);
        propiedadesElfo= new ImageIcon(imagenElfo.getScaledInstance(btnElfo.getWidth(),
                btnElfo.getHeight(), Image.SCALE_DEFAULT));
        btnElfo.setIcon(propiedadesElfo);
        btnElfo.addActionListener(this);
        contenido.add(btnElfo);
        
        imagenGuerrero = new ImageIcon("src//recursos//guerrero.png").getImage();
        btnGuerrero = new JButton("guerrero");
        btnGuerrero.setBounds(230, 100, 120, 170); 
        btnGuerrero.setBorderPainted(true);
        btnGuerrero.setContentAreaFilled(false);
        propiedadesGuerrero= new ImageIcon(imagenGuerrero.getScaledInstance(btnGuerrero.getWidth(),
                btnGuerrero.getHeight(), Image.SCALE_DEFAULT));
        btnGuerrero.setIcon(propiedadesGuerrero);
        btnGuerrero.addActionListener(this);
        contenido.add(btnGuerrero); 
        
        imagenCiborg = new ImageIcon("src//recursos//ciborg.png").getImage();
        btnCiborg = new JButton("ciborg");
        btnCiborg.setBounds(400, 100, 120, 170); 
        btnCiborg.setBorderPainted(true);
        btnCiborg.setContentAreaFilled(false);
        propiedadesCiborg= new ImageIcon(imagenCiborg.getScaledInstance(btnCiborg.getWidth(),
                btnCiborg.getHeight(), Image.SCALE_DEFAULT));
        btnCiborg.setIcon(propiedadesCiborg);
        btnCiborg.addActionListener(this);
        contenido.add(btnCiborg); 
        
        imagenMaga = new ImageIcon("src//recursos//maga.png").getImage();
        btnMaga = new JButton("maga");
        btnMaga.setBounds(570, 100, 120, 170); 
        btnMaga.setBorderPainted(true);
        btnMaga.setContentAreaFilled(false);
        propiedadesMaga= new ImageIcon(imagenMaga.getScaledInstance(btnMaga.getWidth(),
                btnMaga.getHeight(), Image.SCALE_DEFAULT));
        btnMaga.setIcon(propiedadesMaga);
        btnMaga.addActionListener(this);
        contenido.add(btnMaga); 
        
        fondo = new JLabel();
        fondo.setBounds(0, 0, 600, 400);
        fondo.setBackground(Color.GREEN);
        
        imagenFondo = new ImageIcon("src//imagenes//fondo.jpg").getImage();
        propiedadesFondo= new ImageIcon(imagenFondo.getScaledInstance(fondo.getWidth(),
                fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(propiedadesFondo);
        contenido.add(fondo);
        
        setSize(750,350);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String tipo = null;
        if(e.getSource() == btnElfo){
            tipo = "elfo";
            System.out.println(tipo);
            VentanaCantidad ventanaCantidad = new VentanaCantidad(tipo);
            this.hide();
        }if(e.getSource() == btnGuerrero){
            tipo = "guerrero";
            System.out.println(tipo);
            VentanaCantidad ventanaCantidad = new VentanaCantidad(tipo);
            this.hide();
        }if(e.getSource() == btnCiborg){
            tipo = "ciborg";
            System.out.println(tipo);
            VentanaCantidad ventanaCantidad = new VentanaCantidad(tipo);
            this.hide();
        }if(e.getSource() == btnMaga){
            tipo = "maga";
            System.out.println(tipo);
            VentanaCantidad ventanaCantidad = new VentanaCantidad(tipo);
            this.hide();
        }
        
    }
}
