package com.grand.visitor.shapes;

import com.grand.visitor.visitor.Visitor;

public class Rectangle implements Shape{

    private int id;

    private int x;

    private int y;

    private int width;

    private int height;

    public Rectangle(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw(int x, int y) {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
}
