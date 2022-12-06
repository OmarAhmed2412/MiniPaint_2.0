/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Graphics;
import java.awt.Point;
import BackEnd.Rectangle;

/**
 *
 * @author Blu-Ray
 */
public class Square extends SublimeShape{
    
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawRect(this.getPosition().x, this.getPosition().y, this.getLength(), this.getLength());
        canvas.setColor(this.getFillColor());
        canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getLength(), this.getLength());
    }

    @Override
    public boolean contains(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
