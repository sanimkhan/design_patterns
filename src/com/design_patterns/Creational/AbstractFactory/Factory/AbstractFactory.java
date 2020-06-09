package com.design_patterns.Creational.AbstractFactory.Factory;

import com.design_patterns.Creational.AbstractFactory.Shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
