package com.designPatterns.behavioral.visitor.solution.visitors;

import com.designPatterns.behavioral.visitor.solution.mailClients.OperaMailClient;
import com.designPatterns.behavioral.visitor.solution.mailClients.SquirrelMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
}
