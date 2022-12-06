/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Graphics;
import java.awt.Point;
import java.lang.Math.*;

/**
 *
 * @author moham
 */
public class LineSegment extends SublimeShape{

    private Point endingCoordinates;
    
    public void setEndPosition(Point position){
        this.endingCoordinates = position;
    }
    
    public Point getEndPosition(){
        return endingCoordinates;
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawLine(this.getPosition().x, this.getPosition().y, this.getEndPosition().x, this.getEndPosition().y);
    }
    
    private double distance(Point A, Point B) {
        return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
    }
    
    @Override
    public boolean contains(Point point) {
        return distance(this.getPosition(), point) + distance(this.getEndPosition(), point) == distance(this.getPosition(), this.getEndPosition());
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
