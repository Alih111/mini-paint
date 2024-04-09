/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab7.backend;

import java.awt.Point;

/**
 *
 * @author Detective_CN
 */
public interface Movable {
    public void setDraggingPoint(Point P);
    public Point getDraggingPoint();
    public boolean contains(Point P);
    public void moveTo(Point P);
    
}
