package com.design_patterns.Behavioral.Strategy.Authenticators;

public interface AuthenticationProvider {
    void login(String username, String password);

    void logout();
}
