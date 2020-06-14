package com.design_patterns.Behavioral.Strategy.Authenticators;

public class FacebookAuthenticator implements AuthenticationProvider {
    @Override
    public void login(String username, String password) {
        System.out.println("Authenticating with facebook...");
    }

    @Override
    public void logout() {
        System.out.println("Logging out with facebook...");
    }
}
