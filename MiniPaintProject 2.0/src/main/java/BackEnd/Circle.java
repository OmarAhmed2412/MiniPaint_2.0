/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import static java.lang.Math.pow;

/**
 *
 * @author moham
 */
public class Circle extends SublimeShape{
    
    private int raduis;

    public int getRaduis() {
        return this.raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }
   
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawOval(this.getPosition().x, this.getPosition().y, 2*raduis, 2*raduis);
        canvas.setColor(this.getFillColor());
        canvas.fillOval(this.getPosition().x, this.getPosition().y, 2*raduis, 2*raduis);
    }

    @Override
    public boolean contains(Point point) {
        Point center = new Point(this.getPosition().x + this.getRaduis(), this.getPosition().y + this.getRaduis());
        return pow(point.x - center.x, 2) + pow(point.y - center.y, 2) <= pow(raduis, 2);
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
