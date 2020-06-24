package com.designPatterns.behavioral.command;

import com.designPatterns.behavioral.command.commands.OpenCommand;
import com.designPatterns.behavioral.command.commands.SaveCommand;

public class Main {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();

        commandExecutor.executeOperation(new OpenCommand(new TextFile("file1.txt")));
        commandExecutor.executeOperation(new SaveCommand(new TextFile("file2.txt")));
    }
}
