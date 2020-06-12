package com.design_patterns.Behavioral.Command;

import com.design_patterns.Behavioral.Command.Commands.Command;

public class CommandExecutor {

    //private final List<TextFileCommand> textFileCommands = new ArrayList<>();

    public void executeOperation(Command command) {
        //textFileCommands.add(textFileCommand);
        String message = command.execute();

        System.out.println(message);
    }
}
