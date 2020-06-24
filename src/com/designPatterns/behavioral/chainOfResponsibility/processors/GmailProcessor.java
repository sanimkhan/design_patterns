package com.designPatterns.behavioral.chainOfResponsibility.processors;

public class GmailProcessor extends AuthenticationProcessor {

    @Override
    public boolean isAuthorized(String authProvider) {
        System.out.println("Trying Gmail...");

        if (authProvider == "GmailProvider") {
            System.out.println("Processed with Gmail");
            return true;
        } else if (nextProcessor != null) {
            System.out.println("Can not process with Gmail. Setting next");
            return nextProcessor.isAuthorized(authProvider);
        }

        return false;
    }
}
