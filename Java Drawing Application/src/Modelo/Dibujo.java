/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author user
 */
public abstract class Dibujo {
    
    // Atributos
    
    Color color;
    int grosor;

    // Constructor
    
    public Dibujo(Color color, int grosor) {
        this.color = color;
        this.grosor = grosor;
    }
    
    // Getters
    
    public Color getColor() {
        return color;
    }

    public int getGrosor() {
        return grosor;
    }
    
    // Metodo abstracto
    
    public abstract void dibujar(Graphics2D g2d);
    
}

