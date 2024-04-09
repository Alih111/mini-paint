/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7.backend;

import static java.awt.Color.*;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class LineSegment extends ShapesAbstract implements Movable{
    //private static int counter=0;
    Point p2 = new Point();
  
    public LineSegment(Point Poisition) {
        super(Poisition);
        //counter++;
        setPosition(Poisition);
    } 
     public LineSegment(){
         
     }
private static int i=0;
         public static void setI() {
      LineSegment.i = 0;
    }
    public  int getI() {
        i++;
        return i;
    }
   
    public void getSecondPoint(Point SecondPoint)
    {
        this.p2.x = SecondPoint.x;
       
        this.p2.y = SecondPoint.y;
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawLine(getPosition().x, getPosition().y, p2.x, p2.y);
  
    }
    
     @Override
    public String toString() {
        return "Line "+"_"+getI();
    }

    //return distance(A, C) + distance(B, C) == distance(A, B);
 // ___________________________
// /           2              2
// V (A.x - B.x)  + (A.y - B.y)


    @Override
    public boolean contains(Point p3) {
        //0.5 * [x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)]
        
        int a = getPosition().x * (p2.y - p3.y) + p2.x * (p3.y - getPosition().y) + p3.x * (getPosition().y - p2.y); 
if(a==0)
{

    return true;
}
    return false;
    }

    @Override
    public void moveTo(Point P) {
        int x=p2.x-getPosition().x;
        int y=p2.y-getPosition().y;
   p2=new Point(P.x+x,P.y+y);
        
        this.setPosition(P);
        
    }

    @Override
    public void drawBorder() {
   
    }
    @Override
         public LineSegment clone() throws CloneNotSupportedException{
     LineSegment c=    (LineSegment) super.clone();
      c.setPosition(this.getPosition());
      c.setFillColor(this.getFillColor());
      c.setColor(this.getColor());
     c.p2.x=this.p2.x;
     c.p2.y=this.p2.y;
   return c; }
    }                                           
    

