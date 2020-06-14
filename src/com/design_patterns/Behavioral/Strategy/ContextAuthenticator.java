package com.design_patterns.Behavioral.Strategy;

import com.design_patterns.Behavioral.Strategy.Authenticators.AuthenticationProvider;

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
