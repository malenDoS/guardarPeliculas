/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas1_6;

import javax.swing.JFrame;

/**
 *
 * @author malen
 */
public class Ventana extends JFrame {
    private Ventana2 ventana;
    public Ventana(Ventana2 ventanita){
        setSize(980,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(900,100);
        setTitle("Películes 1.6");
        this.ventana=ventanita;
        Laminas lamina;
        lamina=new Laminas(ventana);
        add(lamina);
        setVisible(true);
        
    }
}
