package com.design_patterns.Creational.AbstractFactory.Shapes;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rounded rectangle");
    }
}
