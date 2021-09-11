/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas1_6;

/**
 *
 * @author malen
 */
public class Pelicula {
    private String nombreDirector;
    private String nombrePelicula;
    private String decada;
    private String genero;
    private String origen;
    private String visionado;
    private String opinion;
    
    public Pelicula(String nombreDirector,String nombrePelicula,String decada,String genero,String opinion,String origen,String diaDeVisionado){
        this.nombreDirector=nombreDirector;
        this.nombrePelicula=nombrePelicula;
        this.decada=decada;
        this.genero=genero;
        this.origen=origen;
        this.opinion=opinion;
        this.visionado=diaDeVisionado;
    }
    
    public String getnombreDirector(){
        return nombreDirector;
    }
    public String getNombrePelicula(){
        return nombrePelicula;
    }
    public String getDecada(){
        return decada;
    }
    public String getGenero(){
        return genero;
    }
    public String getOrigen(){
        return origen;
    }
    public String getVisionado(){
        return visionado;
    }
    public String getOpinion(){
        return opinion;
    }
}
