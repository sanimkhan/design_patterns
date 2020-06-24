package com.designPatterns.behavioral.strategy;

import com.designPatterns.behavioral.strategy.authenticators.FacebookAuthenticator;
import com.designPatterns.behavioral.strategy.authenticators.GoogleAuthenticator;
import com.designPatterns.behavioral.strategy.authenticators.InstagramAuthenticator;
import com.designPatterns.behavioral.strategy.authenticators.LinkedInAuthenticator;

public class Main {

    public static void main(String[] args) {
        //sign in with facebook
        ContextAuthenticator context = new ContextAuthenticator(new FacebookAuthenticator());
        context.login("james@gml.com", "S*s23Sd");
        context.logout();

        //sign in with googles
        context = new ContextAuthenticator(new GoogleAuthenticator());
        context.login("jack@gml.com", "Jkjs23*kw");
        context.logout();    //sign in with linkedIn

        context = new ContextAuthenticator(new LinkedInAuthenticator());
        context.login("dave@gml.com", "Ijks9&js@3");
        context.logout();    //sign in with instagram

        context = new ContextAuthenticator(new InstagramAuthenticator());
        context.login("yoda@dcb.com", "HUs&2!3*kw");
        context.logout();
    }
}
