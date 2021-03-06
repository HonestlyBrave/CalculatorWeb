package models;

import command.*;

/**
 * All commands injected and assembled in a set order in one place.
 *
 * @author Muhammad Diallo Thomas - muhammaddiallo.thomas@gmail.com
 */
public class Commands {

    private final Command[] commands;

    public Commands() {
        this.commands = getCommands();
    }

    public void execute(int index) {
        commands[index].execute();
    }

    /**
     *
     * @return array of anonymous Commands
     */
    private Command[] getCommands() {

        Command[] tmp = {new Command0(), new Command1(),
            new Command2(), new Command3(), new Command4(), new Command5(),
            new Command6(), new Command7(), new Command8(), new Command9(),
            new CommandAdd(), new CommandClear(), new CommandDecimal(),
            new CommandDivide(), new CommandMemAdd(), new CommandMemSubtract(),
            new CommandMemRecall(), new CommandSubtract(), new CommandMultiply(),
            new CommandSolve(), new CommandMemClear(), new CommandUndo(),
            new CommandOpenPara(), new CommandClosePara(), new CommandSquared(),
            new CommandCubed()};

        return tmp;
    }
}
