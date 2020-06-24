package com.designPatterns.creational.prototype.color;

public class BlueColor extends Color {
    public BlueColor() {
        this.colorName = "blue";
    }

    @Override
    public void addColor() {
        System.out.println("Blue color added");
    }
}
