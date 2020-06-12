package com.design_patterns.Behavioral.ChainOfResponsibility.Processors;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;

    public void setNext(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(String authProvider);
}
