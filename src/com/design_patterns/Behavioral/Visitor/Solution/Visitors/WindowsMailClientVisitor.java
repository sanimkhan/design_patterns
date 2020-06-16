package com.design_patterns.Behavioral.Visitor.Solution.Visitors;

import com.design_patterns.Behavioral.Visitor.Solution.MailClients.OperaMailClient;
import com.design_patterns.Behavioral.Visitor.Solution.MailClients.SquirrelMailClient;

public class WindowsMailClientVisitor implements MailClientVisitor {
    @Override
    public void visit(OperaMailClient mailClient) {
        System.out.println("Configuration of Opera mail client for Windows complete");
    }

    @Override
    public void visit(SquirrelMailClient mailClient) {
        System.out.println("Configuration of Squirrel mail client for Windows complete");
    }
}
