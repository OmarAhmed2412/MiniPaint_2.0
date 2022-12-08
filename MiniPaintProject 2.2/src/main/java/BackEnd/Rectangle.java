/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Blu-Ray
 */
public class Rectangle extends SublimeShape{
    private int width, height;

    public Rectangle( Point startingCordinates, int width, int height) {
        super(startingCordinates);
        this.width = width;
        this.height = height;
    }
    
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics canvas) {
        Color oldCOlor = canvas.getColor();
        canvas.setColor(this.getColor());
        canvas.drawRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(this.getFillColor());
        canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(oldCOlor);
    }

    @Override
    public boolean contains(Point point) {
        int xRangeStart = this.getPosition().x;
        int xRangeEnd = this.getPosition().x + width;
        int yRangeStart = this.getPosition().y;
        int yRangeEnd = this.getPosition().y + height;
        
        return !(point.x < xRangeStart || point.x > xRangeEnd || point.y < yRangeStart || point.y > yRangeEnd);
    }

    @Override
    public void moveTo(Point point) {
        int offsetX = point.x - this.getDraggingPoint().x;
        int offsetY = point.y - this.getDraggingPoint().y;
        this.setPosition(new Point(this.getPosition().x + offsetX, this.getPosition().y + offsetY));
    }
    
}
