package com.designPatterns.behavioral.chainOfResponsibility.processors;

public class UsernamePasswordProcessor extends AuthenticationProcessor {

    @Override
    public boolean isAuthorized(String authProvider) {
        System.out.println("Trying UsernamePassword...");
        
        if (authProvider == "UsernamePasswordProvider") {
            System.out.println("Processed with UsernamePassword");
            return true;
        } else if (nextProcessor != null) {
            System.out.println("Can not process with UsernamePassword. Setting next");
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}