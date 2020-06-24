package com.designPatterns.behavioral.chainOfResponsibility.processors;

public class OAuthProcessor extends AuthenticationProcessor {

    @Override
    public boolean isAuthorized(String authProvider) {
        System.out.println("Trying OAuth...");

        if (authProvider == "OAuthTokenProvider") {
            System.out.println("Processed with OAuth");
            return true;
        } else if (nextProcessor != null) {
            System.out.println("Can not process with OAuth. Setting next");
            return nextProcessor.isAuthorized(authProvider);
        }

        return false;
    }
}
