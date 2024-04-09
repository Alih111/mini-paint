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
 * @author User
 */
public class Triangle extends ShapesAbstract implements Movable{
    Point p2 =new Point();
    Point p3 = new Point();
     public Triangle(){
         
     }

    public Triangle(Point p) {
        super(p);
    }
     
private static int i=0;
         public static void setI() {
      Triangle.i = 0;
    }
    public  int getI() {
        i++;
        return i;
    }
   
    public void getSecondPoint(Point SecondPoint)
    {
        //System.out.println("second "+SecondPoint.x);
        this.p2.x = SecondPoint.x;
       
        this.p2.y = SecondPoint.y;
    }
       public void getThirdPoint(Point ThirdPoint)
    {
        this.p3.x = ThirdPoint.x;
       
        this.p3.y = ThirdPoint.y;
    }
    @Override
    public void draw(Graphics canvas) {
        //System.out.println(" "+p2.x);
         //" "+getPosition().x
        int [] x={getPosition().x,p2.x,p3.x};
        int[] y={getPosition().y,p2.y,p3.y};
        canvas.setColor(getColor());
     canvas.drawPolygon(x, y, 3);
     canvas.setColor(getFillColor());
     canvas.fillPolygon(x, y, 3);
    }
    @Override
    public String toString(){
        return"triangle_"+getI();
    }
    
    private Polygon turnToPolygon() {
        Point point1 = getPosition();
        return new Polygon(new int[]{point1.x, p2.x, p3.x}, new int[]{point1.y, p2.y, p3.y}, 3);
    }
@Override
    public boolean contains(Point point) {
        return turnToPolygon().contains(point);          //method in java
    }

   // @Override
    //public boolean contains(Point P) {
   
   // double Area = getPosition().x*(p2.y-p3.y)  +  p2.x*(p3.y-getPosition().y)  + p3.x* (getPosition().y-p2.y)/2;

//double Area1 = P.x*(getPosition().y-p2.y)  + getPosition().x*(p2.y-P.y)  + p2.x*(P.y-getPosition().y)/2;

//[ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2
//double Area2 = P.x*(p2.y-p3.y)  +  p2.x*(p3.y-P.y)   + p3.x*(P.y-p2.y)/2;

//double Area3 = P.x*(getPosition().y-p3.y)  + getPosition().x*(p3.y-P.y)  + p3.x*(P.y-getPosition().y)/2;
    /*if(Area1+Area2+Area3 == Area)
        return true;

    return flag;*/
    //}
    
    @Override
    public void moveTo(Point P) {
        int x=p2.x-getPosition().x;
        int y=p2.y-getPosition().y;
        p2=new Point(P.x+x,P.y+y);
         x=p3.x-getPosition().x;
         y=p3.y-getPosition().y;
        p3=new Point(P.x+x,P.y+y);
        this.setPosition(P);
        
    }

    @Override
    public void drawBorder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
     public Triangle clone() throws CloneNotSupportedException{
             Triangle c=    (Triangle) super.clone();
      
            c.setPosition(this.getPosition());
      c.setFillColor(this.getFillColor());
      c.setColor(this.getColor());
    c.p2.x=this.p2.x;
     c.p2.y=this.p2.y;
         c.p3.x=this.p3.x;
     c.p3.y=this.p3.y;
   return c; }
}
