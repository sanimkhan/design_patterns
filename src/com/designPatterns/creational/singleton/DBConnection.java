package com.designPatterns.creational.singleton;

public class DBConnection {    //create the only private instance of the class
    private static DBConnection instance = new DBConnection();    //prevents the class from getting instantiated

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return instance;
    }

    public void executeAction() {
        System.out.println("CRUD action execute successfully");
    }
}
