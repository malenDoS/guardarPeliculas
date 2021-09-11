/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas1_6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author malen
 */
public class Laminas extends JPanel {
    
    private Ventana2 ventanita;
    private JButton botonGuardar;
    private JRadioButton orquilla1;
    private JRadioButton orquilla2;
    private JRadioButton orquilla3;
    private JRadioButton orquilla4;
    private JRadioButton orquilla5;
    private ButtonGroup grupoBotones;
    private JComboBox combo;
    private JTextField nombreP;
    private JTextField nombreD;
    private JTextField diaVisionado;
    private JTextArea escribe;
    private JScrollPane scroll;
    private JMenuBar menu;
    private JMenu archivo;
    private JMenu edicion;
    private JMenu consultar;
    private JMenuItem guardar;
    private JMenuItem volverAEscribir;
    private JMenuItem consultaLista;
    private JButton limpiar;
    private ButtonGroup grupo2;
    private JRadioButton origen1;
    private JRadioButton origen2;
    private JRadioButton origen3;
    private JRadioButton origen4;
    private JRadioButton origen5;
    private JLabel textoOrigen;
    private JLabel textoDecada;
    
    
    public Laminas(Ventana2 finestreta){
        this.ventanita=finestreta;
        setLayout(new BorderLayout());
        //Creo una lámina para colocar el botón de guardar
        JPanel lamina2=new JPanel();
        lamina2.setLayout(new GridLayout(1,1));
        botonGuardar=new JButton("Guardar");
        botonGuardar.setBackground(Color.GREEN);
        botonGuardar.setPreferredSize(new Dimension(300,100));
        limpiar=new JButton("Limpiar");
        Font fuente6=new Font("Serif",Font.BOLD,20);
        botonGuardar.setFont(fuente6);
        limpiar.setFont(fuente6);
        lamina2.add(limpiar);
        lamina2.add(botonGuardar);
        add(lamina2,BorderLayout.SOUTH);
        
       //Orquillas
       orquilla1=new JRadioButton("1900-1930");
       orquilla2=new JRadioButton("1930-1950");
       orquilla3=new JRadioButton("1950-1970");
       orquilla4=new JRadioButton("1970-1990");
       orquilla5=new JRadioButton("1990-X");
       grupoBotones=new ButtonGroup();
       grupoBotones.add(orquilla1);
       grupoBotones.add(orquilla2);
       grupoBotones.add(orquilla3);
       grupoBotones.add(orquilla4);
       grupoBotones.add(orquilla5);
       //Nuevo panel
       JPanel lamina3=new JPanel();
       lamina3.setLayout(new GridLayout(2,3,2,2));
       textoDecada=new JLabel("Década: ");
       Font fuente2=new Font("serif",Font.BOLD,15);
       Font fuente4=new Font("serif",Font.BOLD,20);
       textoDecada.setFont(fuente4);
       textoDecada.setForeground(Color.RED);
       lamina3.add(textoDecada);
       lamina3.add(orquilla1);
       lamina3.add(orquilla2);
       lamina3.add(orquilla3);
       lamina3.add(orquilla4);
       lamina3.add(orquilla5);
       orquilla1.setFont(fuente2);
       orquilla2.setFont(fuente2);
       orquilla3.setFont(fuente2);
       orquilla4.setFont(fuente2);
       orquilla4.setFont(fuente2);
       orquilla5.setFont(fuente2);
       grupo2=new ButtonGroup();
       origen1=new JRadioButton("Asia");
       origen2=new JRadioButton("América latina");
       origen3=new JRadioButton("Europa");
       origen4=new JRadioButton("África");
       origen5=new JRadioButton("Estados Unidos");
       origen1.setFont(fuente2);
       origen2.setFont(fuente2);
       origen3.setFont(fuente2);
       origen4.setFont(fuente2);
       origen5.setFont(fuente2);
       textoOrigen=new JLabel("Origen: ");
       textoOrigen.setFont(fuente4);
       textoOrigen.setForeground(Color.RED);
       lamina3.add(textoOrigen);
       grupo2.add(origen1);
       grupo2.add(origen2);
       grupo2.add(origen3);
       grupo2.add(origen4);
       grupo2.add(origen5);
       lamina3.add(origen1);
       lamina3.add(origen2);
       lamina3.add(origen3);
       lamina3.add(origen4);
       lamina3.add(origen5);
       
       add(lamina3,BorderLayout.EAST);
       //Nuevo panel
       JPanel lamina4 = new JPanel();
       lamina4.setLayout(new BoxLayout(lamina4,3));
       combo=new JComboBox();
   
       combo.addItem("Comedia");
       combo.addItem("Drama");
       combo.addItem("Musical");
       combo.addItem("Terror");
       combo.setFont(fuente2);
       lamina4.add(combo);
       combo.setPreferredSize(new Dimension(180,40));
       escribe=new JTextArea("Escribe tu opinión",30,10);
       escribe.setLineWrap(true);
       scroll=new JScrollPane(escribe);
       lamina4.add(escribe);
       add(lamina4,BorderLayout.WEST);
       
     
       
       //Una nuevo panel para el menu
       JPanel lamina6=new JPanel();
       lamina6.setLayout(new BoxLayout(lamina6,1));
       menu=new JMenuBar();
       archivo=new JMenu("Archivo");
       edicion=new JMenu("Edicion");
       consultar=new JMenu("Consultar Películas");
       menu.add(archivo);
       menu.add(edicion);
       menu.add(consultar);
       guardar=new JMenuItem("Guardar");
       volverAEscribir=new JMenuItem("Limpiar");
       consultaLista=new JMenuItem("Lista de películas");
       archivo.add(guardar);
       edicion.add(volverAEscribir);
       consultar.add(consultaLista);
       lamina6.add(menu);
       nombreP=new JTextField("Nombre de la Película");
       nombreD=new JTextField("Nombre del director");
       lamina6.add(nombreP);
       lamina6.add(nombreD);
       Font fuente=new Font("serif",Font.PLAIN,20);
       nombreP.setFont(fuente);
       nombreD.setFont(fuente);
       nombreP.setPreferredSize(new Dimension(70,50));
       nombreD.setPreferredSize(new Dimension(70,50));
       diaVisionado=new JTextField("Día de visionado");
       diaVisionado.setFont(fuente);
       diaVisionado.setPreferredSize(new Dimension(70,50));
       lamina6.add(diaVisionado);
       add(lamina6,BorderLayout.NORTH);
       
        eventoRaton presionar=new eventoRaton(nombreP);
        nombreP.addMouseListener(presionar);
        eventoRaton presionar2=new eventoRaton(nombreD);
        nombreD.addMouseListener(presionar2);
        eventoRaton cuadroTexto=new eventoRaton(escribe);
        eventoRaton presionar3=new eventoRaton(diaVisionado);
        diaVisionado.addMouseListener(presionar3);
        escribe.addMouseListener(cuadroTexto);
        
        accion accionBoton;
        accionBoton=new accion();
        botonGuardar.addActionListener(accionBoton);
        accionLimpiar limpiarB;
        limpiarB=new accionLimpiar();
        limpiar.addActionListener(limpiarB);
        volverAEscribir.addActionListener(limpiarB);
        guardar.addActionListener(accionBoton);
    }
    
    
    private class accion implements ActionListener{

        private String decada;
        private String origen;
        @Override
        public void actionPerformed(ActionEvent e) {
        if(orquilla1.isSelected()){
            decada=orquilla1.getText();
        }else if(orquilla2.isSelected()){
            decada=orquilla2.getText();
        }else if(orquilla3.isSelected()){
            decada=orquilla3.getText();
        }else if(orquilla4.isSelected()){
            decada=orquilla4.getText();
        }else{
            decada=orquilla5.getText();
        }
        
        if(origen1.isSelected()){
            origen=origen1.getText();
        }else if(origen2.isSelected()){
            origen=origen2.getText();
        }else if(origen3.isSelected()){
            origen=origen3.getText();
        }else if(origen4.isSelected()){
            origen=origen4.getText();
        }else{
            origen=origen5.getText();
        }
        
            Pelicula peliculaGuardar;
            peliculaGuardar=new Pelicula(nombreD.getText(),nombreP.getText(),decada,(String)combo.getSelectedItem(),escribe.getText(),origen,diaVisionado.getText());
            BaseDatos infoPelicula;
            infoPelicula=new BaseDatos(peliculaGuardar);
            try {
                infoPelicula.guardarInfoPeliculas();
            } catch (SQLException ex) {
                Logger.getLogger(Laminas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    private class accionLimpiar implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
          nombreD.setText("Nombre del director");
          nombreP.setText("Nombre de la película");
          orquilla1.setSelected(false);
          orquilla2.setSelected(false);
          orquilla3.setSelected(false);
          orquilla4.setSelected(false);
          orquilla5.setSelected(false);
          escribe.setText("Escribe tu opinión");
          diaVisionado.setText("Día de visionado");
          
        }
        
    }
    
    private class menuConsulta implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
          BaseDatos consultaResultados;
          consultaResultados=new BaseDatos();
            try {
                consultaResultados.resultados(ventanita);
            } catch (SQLException ex) {
                Logger.getLogger(Laminas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
