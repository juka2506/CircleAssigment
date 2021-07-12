package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(14);
        System.out.println(circle1.findCircumference());
        System.out.println(circle1.findArea());

        Circle circle2 = new Circle();
        System.out.println(circle2.findCircumference());
        System.out.println(circle2.findArea());
        circle2.setRadius(7);
        System.out.println(circle2.findCircumference());
        System.out.println(circle2.findArea());
    }


}
