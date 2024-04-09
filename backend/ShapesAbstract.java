/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7.backend;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import java.awt.Point;
import com.mycompany.lab7.frontend.VectorDrawingApplication.*;
/**
 *
 * @author Detective_CN
 */
public  abstract class ShapesAbstract implements Shape ,Movable, Cloneable{
    private Point p ;
    private Color border; 
    private Color fillcolor;
    private Point draggingPoint ;
    private static myPanel2 panel;
     public ShapesAbstract(){
         
     }
    
    public ShapesAbstract(Point p) {
        this.p = p;
    }
    
    
    @Override
    public void setPosition(Point position) {
        this.p = position;
        //System.out.println("set point");
    }

    @Override
    public Point getPosition() {
        return this.p;
    }

    @Override
    public void setColor(Color color) {
        this.border=color;
    }

    @Override
    public Color getColor() {
        return this.border;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillcolor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillcolor;
    }

    @Override
    public abstract void draw(Graphics canvas);
    
    public void setDraggingPoint(Point p){

        this.draggingPoint=p;
}
    
     public Point getDraggingPoint(){
         return this.draggingPoint;
     }
     
      @Override
    public abstract boolean contains(Point P);
    public void drawBorderRectangle(Point p){
        Rectangle r=new Rectangle();
        r.setPosition(p);
        r.setColor(black);
       r.getHightAndWidth(10,10);
        r.draw(panel.getGraphics());
        this.panel.addShape(r);
        
    }

    public myPanel2 getPanel() {
        return panel;
    }
public  void borderRefresher(){
    this.panel.refresh(null);
}
public void changer(Point pre){
    pre.setLocation(getDraggingPoint());
}

    public static void setPanel(myPanel2 panel) {
        
        ShapesAbstract.panel = panel;
    }
 public Shape clone() throws CloneNotSupportedException{
   
     return (Shape) super.clone();
 }
}



   
