package com.design_patterns.Creational.Factory;

import com.design_patterns.Creational.Factory.Shapes.Circle;
import com.design_patterns.Creational.Factory.Shapes.Rectangle;
import com.design_patterns.Creational.Factory.Shapes.Shape;

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
