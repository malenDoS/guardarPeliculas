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
public class Ventana2 extends JFrame{
    
    public Ventana2(){
        setSize(400,500);
        setLocation(600,300);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
    }
    public void setVisibilidad(laminasV2 laminas){
        add(laminas);
        setVisible(true);
    }
}
