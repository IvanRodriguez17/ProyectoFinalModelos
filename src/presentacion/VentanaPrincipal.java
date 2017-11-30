/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class VentanaPrincipal extends JFrame {

    private Lienzo canvas;
    private JPanel contentPane;
    private JLabel lblPersonaje;
    private JLabel lblArma;
    private JLabel lblEscudo;
    private JLabel lblMascota;
    private JLabel lblPersonajeN;
    private JLabel lblArmaN;
    private JLabel lblEscudoN;
    private JLabel lblMascotaN;
    private Image imagenPersonaje;
    private Image imagenArma;
    private Image imagenEscudo;
    private Image imagenMascota;
    private ImageIcon propiedadesPersonaje;
    private ImageIcon propiedadesArma;
    private ImageIcon propiedadesEscudo;
    private ImageIcon propiedadesMascota;

    Image imgBuffer;
    private JLabel lbFondo;

    public VentanaPrincipal(Personaje personaje, ArrayList<Personaje> clonaciones) {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.BLACK);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblPersonaje = new JLabel();
        lblPersonaje.setBounds(25, 310, 150, 150);
        imagenPersonaje = new ImageIcon("src//recursos//"+personaje.getTipo()+".png").getImage();
        propiedadesPersonaje= new ImageIcon(imagenPersonaje.getScaledInstance(lblPersonaje.getWidth(),
                lblPersonaje.getHeight(), Image.SCALE_DEFAULT));
        lblPersonaje.setIcon(propiedadesPersonaje);
        contentPane.add(lblPersonaje);
        
        lblPersonajeN = new JLabel(personaje.getTipo());
        lblPersonajeN.setBounds(50,470, 150, 50);
        lblPersonajeN.setForeground(Color.WHITE);
        lblPersonajeN.setFont(new Font("Fillmore", Font.BOLD, 18));
        contentPane.add(lblPersonajeN);
        
        lblMascota = new JLabel();
        lblMascota.setBounds(225, 310, 150, 150);
        imagenMascota = new ImageIcon(personaje.getMascota().getRuta()).getImage();
        propiedadesMascota = new ImageIcon(imagenMascota.getScaledInstance(lblMascota.getWidth(),
                lblMascota.getHeight(), Image.SCALE_DEFAULT));
        lblMascota.setIcon(propiedadesMascota);
        contentPane.add(lblMascota);
        
        lblMascotaN = new JLabel(personaje.getMascota().getNombre());
        lblMascotaN.setBounds(200,470, 200, 50);
        lblMascotaN.setForeground(Color.WHITE);
        lblMascotaN.setFont(new Font("Fillmore", Font.BOLD, 16));
        contentPane.add(lblMascotaN);
        
        lblArma = new JLabel();
        lblArma.setBounds(425, 310, 150, 150);
        imagenArma = new ImageIcon(personaje.getArma().getRuta()).getImage();
        propiedadesArma = new ImageIcon(imagenArma.getScaledInstance(lblArma.getWidth(),
                lblArma.getHeight(), Image.SCALE_DEFAULT));
        lblArma.setIcon(propiedadesArma);
        contentPane.add(lblArma);
        
        lblArmaN = new JLabel(personaje.getArma().getNombre());
        lblArmaN.setBounds(400,470, 200, 50);
        lblArmaN.setForeground(Color.WHITE);
        lblArmaN.setFont(new Font("Fillmore", Font.BOLD, 16));
        contentPane.add(lblArmaN);
        
        lblEscudo = new JLabel();
        lblEscudo.setBounds(600, 310, 150, 150);
        imagenEscudo = new ImageIcon(personaje.getEscudo().getRuta()).getImage();
        propiedadesEscudo = new ImageIcon(imagenEscudo.getScaledInstance(lblEscudo.getWidth(),
                lblEscudo.getHeight(), Image.SCALE_DEFAULT));
        lblEscudo.setIcon(propiedadesEscudo);
        contentPane.add(lblEscudo);
        
        lblEscudoN = new JLabel(personaje.getEscudo().getNombre());
        lblEscudoN.setBounds(600,470, 200, 50);
        lblEscudoN.setForeground(Color.WHITE);
        lblEscudoN.setFont(new Font("Fillmore", Font.BOLD, 16));
        contentPane.add(lblEscudoN);
        
        Lienzo lienzo = new Lienzo(clonaciones);
        lienzo.setLocation(0, 0);
        lienzo.setSize(800, 300);
        contentPane.add(lienzo);
        
        setSize(800, 550);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

}
