/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas1_6;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author malen
 */
public class eventoRaton extends MouseAdapter {
    private JTextField textoPresionado;
    private JTextArea escritura;
    public eventoRaton(JTextField campoTexto){
        textoPresionado=campoTexto;
    }
    public eventoRaton(JTextArea campoEscritura){
        escritura=campoEscritura;
    }
    
    public void mousePressed(MouseEvent e){
        if(e.getSource()==textoPresionado){
           textoPresionado.setText(""); 
        }else{
            escritura.setText("");
        }
       
       
    }
}
