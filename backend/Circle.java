/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7.backend;

import java.awt.Graphics;
import java.awt.Point;


/**
 *
 * @author User
 */
public class Circle extends ShapesAbstract implements Movable{
    
    private static int i=0;
    private int horizontalRadius;
    private int verticalRadius;
    
    public Circle ()
    {
        
    }
   

    public Circle(Point newPoint,int radius) {
        this.horizontalRadius=radius;
       
        
        
    }

    public static void setI() {
        Circle.i = 0;
    }


    public  int getI() {
        i++;
        return i;
    }




    @Override
    public void draw(Graphics canvas) {
        
        
       
           canvas.setColor(this.getColor());
        canvas.drawOval(getPosition().x-this.horizontalRadius, getPosition().y-this.verticalRadius, 2*horizontalRadius, 2*verticalRadius);
        canvas.setColor(this.getFillColor());
        canvas.fillOval(getPosition().x-horizontalRadius, getPosition().y-verticalRadius, 2*horizontalRadius, 2*verticalRadius);
       
       
    }  
    

    public void setR(int r,int vr) {
        this.horizontalRadius = r;
        this.verticalRadius = vr;
    }
    
       @Override
    public String toString() {
        return "Circle "+"_"+getI();
    }


    @Override
    public boolean contains(Point po) {
        
       
       
       /*double p = ((double)Math.pow((x - h), 2)
                    / (double)Math.pow(a, 2))
                   + ((double)Math.pow((y - k), 2)
                      / (double)Math.pow(b, 2));
 
        return p;*/
       double p = ((double)Math.pow(po.x-getPosition().x, 2)/(double)Math.pow(horizontalRadius, 2))+((double)Math.pow(po.y-getPosition().y, 2)/(double)Math.pow(verticalRadius, 2));
        if(p<=1)
            return  true;
      /* double d = Math.sqrt(Math.pow(getPosition().x-p.x, 2) + Math.pow(getPosition().y-p.y,2));  //check if the point lies on the circle
       if(d <= (double)this.horizontalRadius)
            return true;
       if(d <= (double)this.verticalRadius)
           return true;*/
       
       return false;
     
    }

    
    @Override
    public void moveTo(Point P) {
        this.setPosition(P);
    }

    @Override
    public void drawBorder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
 public Circle  clone() throws CloneNotSupportedException {
      Circle c=    (Circle) super.clone();
        c.setPosition(this.getPosition());
      c.setFillColor(this.getFillColor());
      c.setColor(this.getColor());
    c.horizontalRadius=this.horizontalRadius;
    c.setDraggingPoint(this.getDraggingPoint());
    c.verticalRadius=this.verticalRadius;
     
   return c; }
}

