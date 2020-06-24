package com.designPatterns.behavioral.chainOfResponsibility;

import com.designPatterns.behavioral.chainOfResponsibility.processors.AuthenticationProcessor;
import com.designPatterns.behavioral.chainOfResponsibility.processors.GmailProcessor;
import com.designPatterns.behavioral.chainOfResponsibility.processors.OAuthProcessor;
import com.designPatterns.behavioral.chainOfResponsibility.processors.UsernamePasswordProcessor;

public class Main {

    public static void main(String[] args) {

        //  create handler objects
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor();
        AuthenticationProcessor usernamePasswordProcessor = new UsernamePasswordProcessor();
        AuthenticationProcessor gmailProcessor = new GmailProcessor();

        //  create the chain
        oAuthProcessor.setNext(usernamePasswordProcessor);
        usernamePasswordProcessor.setNext(gmailProcessor);

        oAuthProcessor.isAuthorized("GmailProvider");
    }
}
