package com.design_patterns.Creational.AbstractFactory;

import com.design_patterns.Creational.AbstractFactory.Factory.AbstractFactory;
import com.design_patterns.Creational.AbstractFactory.Factory.RoundedShapeFactory;
import com.design_patterns.Creational.AbstractFactory.Factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
