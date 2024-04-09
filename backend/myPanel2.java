/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7.backend;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Detective_CN
 */
public class myPanel2 extends JPanel implements DrawingEngine{
    private ArrayList <Shape> shapes;

    public myPanel2() {
        //super();
        shapes =new ArrayList<>();
    }
    @Override
    public void  paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (Shape s: shapes)           //for each loop
            s.draw(g);
        
    }
    
    @Override
    public void addShape(Shape shape) {
        //System.out.println("add");
        this.shapes.add(shape);
        //System.out.println(shapes.get(0));
       
    }

    @Override
    public void removeShape(Shape shape) {
        this.shapes.remove(shape);  
    }

    @Override
    public Shape[] getShapes() {
        return  this.shapes.toArray(Shape[] :: new);
    }

    @Override
    public void refresh(Graphics canvas) {
         System.out.println(shapes.size());
        repaint();
    }
    
    
}
