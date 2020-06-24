package com.designPatterns.behavioral.visitor.problem;

public class Main {

    public static void main(String[] args) {

        MailClient operaMailClient = new OperaMailClient();
        operaMailClient.configureForMac();
        operaMailClient.configureForWindows();
        MailClient squirrelMailClient = new SquirrelMailClient();
        squirrelMailClient.configureForMac();
        squirrelMailClient.configureForWindows();
    }
}
