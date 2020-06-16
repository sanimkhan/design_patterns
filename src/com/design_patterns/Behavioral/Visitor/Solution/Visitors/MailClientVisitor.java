package com.design_patterns.Behavioral.Visitor.Solution.Visitors;

import com.design_patterns.Behavioral.Visitor.Solution.MailClients.OperaMailClient;
import com.design_patterns.Behavioral.Visitor.Solution.MailClients.SquirrelMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
}
