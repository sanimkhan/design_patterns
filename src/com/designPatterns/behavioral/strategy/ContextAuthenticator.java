package com.designPatterns.behavioral.strategy;

import com.designPatterns.behavioral.strategy.authenticators.AuthenticationProvider;

public class ContextAuthenticator {
    private AuthenticationProvider strategy;

    ContextAuthenticator(AuthenticationProvider strategy) {
        this.strategy = strategy;
    }

    public void login(String username, String password) {
        strategy.login(username, password);
    }

    public void logout() {
        strategy.logout();
    }
}
