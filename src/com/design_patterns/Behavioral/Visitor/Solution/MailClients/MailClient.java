package com.design_patterns.Behavioral.Visitor.Solution.MailClients;

import com.design_patterns.Behavioral.Visitor.Solution.Visitors.MailClientVisitor;

public interface MailClient {
    void sendMail(String[] mailInfo);

    void receiveMail(String[] mailInfo);

    boolean accept(MailClientVisitor visitor);
}
