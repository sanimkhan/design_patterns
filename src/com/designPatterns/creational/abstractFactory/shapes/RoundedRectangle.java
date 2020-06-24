package com.designPatterns.creational.abstractFactory.shapes;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rounded rectangle");
    }
}
