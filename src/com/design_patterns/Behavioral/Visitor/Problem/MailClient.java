package com.design_patterns.Behavioral.Visitor.Problem;

public interface MailClient {
    void sendMail(String[] mailInfo);

    void receiveMail(String[] mailInfo);

    boolean configureForMac();

    boolean configureForWindows();
}
