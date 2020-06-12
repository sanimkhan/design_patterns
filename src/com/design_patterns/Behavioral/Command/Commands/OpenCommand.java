package com.design_patterns.Behavioral.Command.Commands;

import com.design_patterns.Behavioral.Command.TextFile;

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
