package com.designPatterns.behavioral.visitor.solution;

import com.designPatterns.behavioral.visitor.solution.mailClients.OperaMailClient;
import com.designPatterns.behavioral.visitor.solution.mailClients.SquirrelMailClient;
import com.designPatterns.behavioral.visitor.solution.visitors.MacMailClientVisitor;
import com.designPatterns.behavioral.visitor.solution.visitors.WindowsMailClientVisitor;

public class Main {

    public static void main(String[] args) {

        WindowsMailClientVisitor windowsVisitor = new WindowsMailClientVisitor();
        MacMailClientVisitor macMailClientVisitor = new MacMailClientVisitor();

        OperaMailClient operaMailClient = new OperaMailClient();
        SquirrelMailClient squirrelMailClient = new SquirrelMailClient();


        System.out.println("-----Testing Mail Client for different environments-----");
        operaMailClient.accept(windowsVisitor);
        operaMailClient.accept(macMailClientVisitor);

        System.out.println();
        squirrelMailClient.accept(windowsVisitor);
        squirrelMailClient.accept(macMailClientVisitor);
    }
}
