package com.design_patterns.Behavioral.Visitor.Solution;

import com.design_patterns.Behavioral.Visitor.Solution.MailClients.OperaMailClient;
import com.design_patterns.Behavioral.Visitor.Solution.MailClients.SquirrelMailClient;
import com.design_patterns.Behavioral.Visitor.Solution.Visitors.MacMailClientVisitor;
import com.design_patterns.Behavioral.Visitor.Solution.Visitors.WindowsMailClientVisitor;

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
