package com.designPatterns.behavioral.command;

import com.designPatterns.behavioral.command.commands.Command;

public class CommandExecutor {

    //private final List<TextFileCommand> textFileCommands = new ArrayList<>();

    public void executeOperation(Command command) {
        //textFileCommands.add(textFileCommand);
        String message = command.execute();

        System.out.println(message);
    }
}
