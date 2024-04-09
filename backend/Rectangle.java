/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7.backend;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import static java.lang.Math.abs;

/**
 *
 * @author Detective_CN
 */
public class Rectangle extends ShapesAbstract implements Movable{
    //private static int counter=0;
    int higth;
    int width;
    private static int i=0;
    private myPanel2 pan=super.getPanel();
    
    //public LineSegment(Point Poisition) {
      //  super(Poisition);
    //} 
     public Rectangle(){
      
     }
         public static void setI() {
       Rectangle.i = 0;
    }
    public  int getI() {
        i++;
        return i;
    }
    public void getHightAndWidth(int hight,int width)
    {
        this.higth = hight;
       
        this.width = width;
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, this.width,this.higth);
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x, getPosition().y, this.width,this.higth);
        
    }

    @Override
    public String toString() {
        if(this.higth==this.width)
           return "Square"+"_"+getI(); 
        return "Rectangle "+"_"+getI();
    }
          //method in java
    @Override
    public boolean contains(Point p) {
          // boolean flag =false;
        int x =getPosition().x;
        int y =getPosition().y;
        
        if(p.x<=x+this.width && p.y<=this.higth+y&&p.x>x && p.y>y ){
          return true;}

        return false;
        
        
    }

    @Override
    public void moveTo(Point P) {
        
        this.setPosition(P);
    }

    @Override
    public void drawBorder() {
        
        Point p2=new Point(getPosition().x-10,getPosition().y-10);
        super.drawBorderRectangle(p2);
         p2=new Point(getPosition().x+width,getPosition().y+higth);
        super.drawBorderRectangle(p2);
            p2=new Point(getPosition().x+width,getPosition().y-10);
            super.drawBorderRectangle(p2);          
            p2=new Point(getPosition().x-10,getPosition().y+higth);
        super.drawBorderRectangle(p2);
        
    }
    @Override
    public Rectangle clone() throws CloneNotSupportedException{
   Rectangle c=    (Rectangle) super.clone();
            c.setPosition(this.getPosition());
      c.setFillColor(this.getFillColor());
      c.setColor(this.getColor());
c.higth=this.higth;
c.width=this.width;
  c.pan=this.pan;   
   return c; }

    
    
    }                                
