package com.kundan.day17april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 4.0);
        Triangle triangle = new Triangle(6.0, 3.0);
        RightTriangle rightTriangle = new RightTriangle(8.0, 4.0);

        //print details
        System.out.println("Circle with radius: "+ circle.radius);
        System.out.println("Rectangle with length: "+rectangle.length+" and width: "+rectangle.width);
        System.out.println("Triangle with base: "+ triangle.base+ " and base "+ triangle.base);
        System.out.println("RightTriangle with base: "+ rightTriangle.base+" height: "+ rightTriangle.height);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
