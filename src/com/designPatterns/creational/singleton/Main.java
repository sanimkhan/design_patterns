package com.designPatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        DBConnection eagerInstance = DBConnection.getInstance();
        eagerInstance.executeAction();

        LazyDBConnection lazyInstance = LazyDBConnection.getInstance();
        lazyInstance.executeAction();
    }
}
