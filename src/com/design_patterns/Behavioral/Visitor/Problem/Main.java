package com.design_patterns.Behavioral.Visitor.Problem;

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
