package com.designPatterns.behavioral.strategy.authenticators;

public class InstagramAuthenticator implements AuthenticationProvider {
    @Override
    public void login(String username, String password) {
        System.out.println("Authenticating with instagram...");
    }

    @Override
    public void logout() {
        System.out.println("Logging out with instagram...");
    }
}
