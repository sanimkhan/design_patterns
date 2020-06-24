package com.designPatterns.behavioral.strategy.authenticators;

public interface AuthenticationProvider {
    void login(String username, String password);

    void logout();
}
