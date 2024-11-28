/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Trazo extends Dibujo {
    
    // Atributo
    
    private final ArrayList<Point> puntos;

    // Constructor
    
    public Trazo(Color color, int grosor) {
        super(color, grosor);
        this.puntos = new ArrayList<>();
    }
    
    // Setter
    
    public int setGrosor(int grosor) {
        return grosor;
    }

    // Metodos
    
    public void addPoint(Point punto) {
        puntos.add(punto);
    }
    
    // Sobreescribir clase abstracta
    
    @Override
    public void dibujar(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(grosor,
                // Bordes redondeados
                BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND));
        for (int i = 0; i < (puntos.size() - 1); i++) {
            Point p1 = puntos.get(i);
            Point p2 = puntos.get(i + 1);
            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

}
