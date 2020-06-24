package com.designPatterns.creational.abstractFactory;

import com.designPatterns.creational.abstractFactory.factory.AbstractFactory;
import com.designPatterns.creational.abstractFactory.factory.RoundedShapeFactory;
import com.designPatterns.creational.abstractFactory.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
