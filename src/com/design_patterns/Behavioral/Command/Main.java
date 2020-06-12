package com.design_patterns.Behavioral.Command;

import com.design_patterns.Behavioral.Command.Commands.OpenCommand;
import com.design_patterns.Behavioral.Command.Commands.SaveCommand;

public class Main {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();

        commandExecutor.executeOperation(new OpenCommand(new TextFile("file1.txt")));
        commandExecutor.executeOperation(new SaveCommand(new TextFile("file2.txt")));
    }
}
