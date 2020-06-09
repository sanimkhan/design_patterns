package com.design_patterns.Creational.AbstractFactory.Factory;

import com.design_patterns.Creational.AbstractFactory.Shapes.Rectangle;
import com.design_patterns.Creational.AbstractFactory.Shapes.Shape;
import com.design_patterns.Creational.AbstractFactory.Shapes.Square;

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
