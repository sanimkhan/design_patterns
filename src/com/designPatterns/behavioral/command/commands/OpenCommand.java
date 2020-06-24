package com.designPatterns.behavioral.command.commands;

import com.designPatterns.behavioral.command.TextFile;

public class OpenCommand implements Command {

    private TextFile textFile;

    public OpenCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        System.out.println("Open file command");
        return textFile.open();
    }
}
