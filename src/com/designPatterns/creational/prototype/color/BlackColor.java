package com.designPatterns.creational.prototype.color;

public class BlackColor extends Color {
    public BlackColor() {
        this.colorName = "black";
    }

    @Override
    public void addColor() {
        System.out.println("Black color added");
    }
}
