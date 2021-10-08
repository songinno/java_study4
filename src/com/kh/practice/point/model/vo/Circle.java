package com.kh.practice.point.model.vo;

public class Circle extends Point{
    int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    //g,s
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("(x: %d, y: %d, radius: %d)", this.getX(), this.getY(), this.getRadius());
    }
}
