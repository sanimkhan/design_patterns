package com.designPatterns.behavioral.chainOfResponsibility.processors;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;

    public void setNext(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(String authProvider);
}
