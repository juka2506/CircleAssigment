package com.company;

public class Circle {

    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double findCircumference () {
        return 2 * Math.PI * (double) radius;
    }

    public double findArea () {
        return Math.PI * Math.pow(radius, 2);
    }
}
