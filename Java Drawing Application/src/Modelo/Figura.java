/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author user
 */
public class Figura extends Dibujo {
    private Shape figuraActual;
    private final Point inicio;    

    public Figura(Color color, int grosor, Point inicio, Point fin, String tipo) {
        super(color, grosor);
        this.inicio = inicio;  
        this.crearFigura(inicio, fin, tipo);
    }
    
    public void crearFigura(Point inicio, Point fin, String tipo) {
        
        int ancho = Math.abs(fin.x - inicio.x);
        int alto = Math.abs(fin.y - inicio.y);
        int ArribaIzqX = Math.min(inicio.x, fin.x);
        int ArribaIzqY = Math.min(inicio.y, fin.y);
        
        if (tipo.equals("Rectangulo")){
            figuraActual = new Rectangle2D.Double(ArribaIzqX, ArribaIzqY, ancho, alto);
        } else if (tipo.equals("Ovalo")){
            figuraActual = new Ellipse2D.Double(ArribaIzqX, ArribaIzqY, ancho, alto);
        }
        
    }

    // Getter
    
    public Point getInicio() {
        return this.inicio;
    }
    
    // Setters
    
    public int setGrosor(int grosor) {
        return grosor;
    }
    
    // Sobreescribir clase abstracta
    
    @Override
    public void dibujar(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(grosor));
        g2d.draw(figuraActual);
    }
    
}