package com.designPatterns.behavioral.visitor.solution.mailClients;

import com.designPatterns.behavioral.visitor.solution.visitors.MailClientVisitor;

public interface MailClient {
    void sendMail(String[] mailInfo);

    void receiveMail(String[] mailInfo);

    boolean accept(MailClientVisitor visitor);
}
