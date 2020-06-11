package com.design_patterns.Behavioral.Template;

import com.design_patterns.Behavioral.Template.Templates.Cricket;
import com.design_patterns.Behavioral.Template.Templates.Football;
import com.design_patterns.Behavioral.Template.Templates.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
