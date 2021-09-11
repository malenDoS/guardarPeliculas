/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas1_6;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author malen
 */
public class laminasV2 extends JPanel {
    
    private JTextArea peliculas;
    private Pelicula[] textoPeliculas;
    
    
    public void construirLamina2(){
        setLayout(new BorderLayout());
        
    }
    
    public void setTextPeliculas(Pelicula [] peliculasT){
        peliculas=new JTextArea();
        textoPeliculas=new Pelicula[peliculasT.length];
        textoPeliculas=peliculasT.clone();
        int contador=1;
        for(int i=0;i<=textoPeliculas.length;i++){
            peliculas.insert("*******************", contador);
            peliculas.insert("Película nº"+i, contador++);
            peliculas.insert("Nombre de la película: "+textoPeliculas[i].getNombrePelicula(), contador++);
            peliculas.insert("Nombre del director: "+textoPeliculas[i].getnombreDirector(), contador++);
            peliculas.insert("Origen de la película: "+textoPeliculas[i].getOrigen(), contador++);
            peliculas.insert("Año de realización: "+textoPeliculas[i].getDecada(), contador++);
            peliculas.insert("Día de visionado: "+textoPeliculas[i].getVisionado(),contador++);
            peliculas.insert("Opinión de la película: "+textoPeliculas[i].getOpinion(), contador++);
            peliculas.insert("Género de la película: "+textoPeliculas[i].getGenero(), contador++);
            peliculas.insert("++++++++++++++++++++", contador++);
            peliculas.insert("", contador++);
        }
        add(peliculas);
    }
}
