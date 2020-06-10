package com.design_patterns.Creational.Singleton;

import com.design_patterns.Creational.Factory.ShapeFactory;
import com.design_patterns.Creational.Factory.Shapes.Shape;

public class Main {

    public static void main(String[] args) {
        DBConnection eagerInstance = DBConnection.getInstance();
        eagerInstance.executeAction();

        LazyDBConnection lazyInstance = LazyDBConnection.getInstance();
        lazyInstance.executeAction();
    }
}
