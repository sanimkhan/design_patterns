package com.designPatterns.creational.singleton;

public class LazyDBConnection {
    private static volatile LazyDBConnection instance;

    //prevents the class from getting instantiated
    private LazyDBConnection() {
    }

    public static LazyDBConnection getInstance() {

        if (instance == null) {
            synchronized (LazyDBConnection.class) {
                instance = new LazyDBConnection();
            }
        }

        return instance;
    }

    public void executeAction() {

        System.out.println("CRUD action execute successfully");
    }
}
