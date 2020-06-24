package com.designPatterns.creational.factory;

import com.designPatterns.creational.factory.shapes.Circle;
import com.designPatterns.creational.factory.shapes.Rectangle;
import com.designPatterns.creational.factory.shapes.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
