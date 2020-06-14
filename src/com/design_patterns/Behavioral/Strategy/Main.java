package com.design_patterns.Behavioral.Strategy;

import com.design_patterns.Behavioral.Strategy.Authenticators.FacebookAuthenticator;
import com.design_patterns.Behavioral.Strategy.Authenticators.GoogleAuthenticator;
import com.design_patterns.Behavioral.Strategy.Authenticators.InstagramAuthenticator;
import com.design_patterns.Behavioral.Strategy.Authenticators.LinkedInAuthenticator;

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
