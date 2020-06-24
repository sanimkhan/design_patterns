package com.designPatterns.creational.abstractFactory.shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
