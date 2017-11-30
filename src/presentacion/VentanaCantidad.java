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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import constructoras.ConstructoraAbstracta;
import constructoras.Director;
import personajes.Personaje;
import prototipos.GestorPrototipos;

/**
 *
 * @author ivanr
 */
public class VentanaCantidad extends JFrame implements ActionListener {

    private JTextField txtNumero;
    private JPanel contenido;
    private JLabel lblFondo;
    private JLabel lblSeleccion;
    private JButton btnIniciar;
    private ImageIcon imagenFondo;
    private ImageIcon propiedadesFondo;
    private String tipo;

    public VentanaCantidad(String tipoPj) {

        tipo = tipoPj;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CATALOGO PERSONAJES V.1");

        contenido = new JPanel();
        contenido.setBounds(0, 0, 600, 400);
        contenido.setBackground(Color.BLACK);
        contenido.setLayout(null);
        add(contenido);

        lblSeleccion = new JLabel("la cantidad de personajes es :");
        lblSeleccion.setBounds(75, 0, 500, 100);
        lblSeleccion.setFont(new Font("Fillmore", Font.BOLD, 24));
        lblSeleccion.setForeground(Color.WHITE);
        contenido.add(lblSeleccion);

        txtNumero = new JTextField();
        txtNumero.setBackground(Color.WHITE);
        txtNumero.setForeground(Color.BLUE);
        txtNumero.setFont(new Font("Fillmore", Font.BOLD, 28));
        txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
        txtNumero.setBounds(200, 100, 200, 100);
        contenido.add(txtNumero);

        btnIniciar = new JButton("Iniciar Juego");
        btnIniciar.setBounds(200, 250, 200, 50);
        btnIniciar.addActionListener(this);
        btnIniciar.setVisible(true);
        contenido.add(btnIniciar);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadena = txtNumero.getText();
        int numero = 0;
        try {
            numero = Integer.parseInt(cadena);
            if (numero <= 0 || numero > 9) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 1 y 9");
            } else {
                GestorPrototipos gestor = new GestorPrototipos();
                VentanaPrincipal ventanaPrin = new VentanaPrincipal(crearPersonaje(), gestor.crearClonaciones(numero, crearPersonaje()));
                this.hide();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
            return;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(VentanaCantidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Personaje crearPersonaje() {
        ConstructoraAbstracta constructora = Director.getSingletonInstance(tipo);
        constructora.construirArma();
        constructora.construirEscudo();
        constructora.construirImagenes();
        constructora.construirMascota();
        constructora.construirPersonaje();
        Personaje pj = constructora.getPersonaje();
        return pj;
    }
}
