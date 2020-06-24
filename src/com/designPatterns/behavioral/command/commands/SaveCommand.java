package com.designPatterns.behavioral.command.commands;

import com.designPatterns.behavioral.command.TextFile;

public class SaveCommand implements Command {

    private TextFile textFile;

    public SaveCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        System.out.println("Save file command");
        return textFile.save();
    }
}