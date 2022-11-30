package commands.gameMenuCommands;

import commands.abstracts.Command;
import game.SessionCommands;

public class ChooseVar1 implements Command {
    private SessionCommands sessionCommands;


    public ChooseVar1(SessionCommands sessionCommands) {
        this.sessionCommands = sessionCommands;
    }

    @Override
    public void execute() {
        sessionCommands.chooseVar1();
    }

    @Override
    public String getName() {
        return sessionCommands.getVar1Name();
    }
}
