package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.findCircumference());
        System.out.println(circle1.findArea());

        Circle circle2 = new Circle();
        System.out.println(circle2.findCircumference());
        System.out.println(circle2.findArea());
        circle2.setRadius(3);
        System.out.println(circle2.findCircumference());
        System.out.println(circle2.findArea());
    }


}
