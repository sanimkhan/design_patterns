package com.designPatterns.behavioral.template;

import com.designPatterns.behavioral.template.templates.Cricket;
import com.designPatterns.behavioral.template.templates.Football;
import com.designPatterns.behavioral.template.templates.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
