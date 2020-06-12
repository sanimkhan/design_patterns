package com.design_patterns.Behavioral.ChainOfResponsibility;

import com.design_patterns.Behavioral.ChainOfResponsibility.Processors.AuthenticationProcessor;
import com.design_patterns.Behavioral.ChainOfResponsibility.Processors.GmailProcessor;
import com.design_patterns.Behavioral.ChainOfResponsibility.Processors.OAuthProcessor;
import com.design_patterns.Behavioral.ChainOfResponsibility.Processors.UsernamePasswordProcessor;

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
