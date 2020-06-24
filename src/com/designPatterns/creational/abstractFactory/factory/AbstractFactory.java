package com.designPatterns.creational.abstractFactory.factory;

import com.designPatterns.creational.abstractFactory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
