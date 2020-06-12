package com.design_patterns.Behavioral.Command.Commands;

import com.design_patterns.Behavioral.Command.TextFile;

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