package com.designPatterns.creational.abstractFactory.factory;

import com.designPatterns.creational.abstractFactory.shapes.Rectangle;
import com.designPatterns.creational.abstractFactory.shapes.Shape;
import com.designPatterns.creational.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
