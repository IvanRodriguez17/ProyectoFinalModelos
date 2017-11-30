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
public class VentanaInicio extends JFrame implements ActionListener{
    
    private JPanel contenido;
    private JLabel lblTitulo;
    private JButton btnIniciar;
    private Image imagenBtn;
    private ImageIcon propiedadesBtn;
    
    public VentanaInicio(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CATALOGO PERSONAJES V.1");
        setLayout(null);
        
        contenido =  new JPanel();
        contenido.setBounds(0, 0, 600, 400);
        contenido.setBackground(Color.BLACK);
        contenido.setLayout(null);
        add(contenido);
        
        lblTitulo = new JLabel("Bienvenido");
        lblTitulo.setBounds(50, 50, 550, 50);
        lblTitulo.setFont(new Font("Fillmore", Font.BOLD, 72));
        lblTitulo.setForeground(Color.WHITE);
        contenido.add(lblTitulo);
        
        imagenBtn = new ImageIcon("src//recursos//boton-start.png").getImage();
        btnIniciar = new JButton("Comenzar");
        btnIniciar.setBounds(200, 150, 178, 178); 
        btnIniciar.setBorderPainted(true);
        btnIniciar.setContentAreaFilled(false);
        propiedadesBtn= new ImageIcon(imagenBtn.getScaledInstance(btnIniciar.getWidth(), btnIniciar.getHeight(), Image.SCALE_DEFAULT));
        btnIniciar.setIcon(propiedadesBtn);
        btnIniciar.addActionListener(this);
        contenido.add(btnIniciar);
        
        setVisible(true);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIniciar) {
            VentanaSeleccion ventanaSeleccion = new VentanaSeleccion();
            this.hide();
        }
    }
}
