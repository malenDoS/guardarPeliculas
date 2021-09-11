/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas1_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author malen
 */
public class BaseDatos {
    private String url;
    private String user;
    private String contrasena;
    private Pelicula peliculaGuardar;
    private Pelicula[] pelis;
    public BaseDatos(Pelicula pelicula){
        url="jdbc:mysql://localhost:3306/peliculas";
        user="root";
        contrasena="nloeig31416";
        this.peliculaGuardar=pelicula;
    }
    public BaseDatos(){
        url="jdbc:mysql://localhost:3306/peliculas";
        user="root";
        contrasena="nloeig31416";
    }
    
    public void guardarInfoPeliculas() throws SQLException{
        Connection miConexion=DriverManager.getConnection(url, user,contrasena);
        Statement miStatement=miConexion.createStatement();
        miStatement.executeUpdate("INSERT INTO infopelicula (nombre_Pelicula,nombre_Director,Origen_Pelicula,año_Pelicula,dia_Visionado,opinion,genero)VALUES('"+peliculaGuardar.getNombrePelicula()+"','"+peliculaGuardar.getnombreDirector()+"','"+peliculaGuardar.getOrigen()+"','"+peliculaGuardar.getDecada()+"','"+peliculaGuardar.getVisionado()+"','"+peliculaGuardar.getOpinion()+"','"+peliculaGuardar.getGenero()+"')");
        miConexion.close();
        miStatement.close();
    }
    
    public void resultados(Ventana2 ventanita) throws SQLException{
        Connection miConexion2=DriverManager.getConnection(url,user,contrasena);
        Statement miStatement2=miConexion2.createStatement();
        ResultSet resultados=miStatement2.executeQuery("SELECT * FROM infopelicula");
        pelis=new Pelicula[resultados.getRow()];
        int contador=1;
        while(resultados.next()){
            pelis[contador]=new Pelicula(resultados.getString("nombre_Director"),resultados.getString("nombre_Pelicula"),resultados.getString("año_Pelicula"),resultados.getString("genero"),resultados.getString("opinion"),resultados.getString("Origen_Pelicula"),resultados.getString("dia_Visionado"));
        }
        laminasV2 laminas;
        laminas=new laminasV2();
        laminas.construirLamina2();
        laminas.setTextPeliculas(pelis);
        ventanita.setVisibilidad(laminas);
        
    }
    
}
