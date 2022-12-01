package commands.gameMenuCommands;

import commands.abstracts.Command;
import game.runners.SessionRunner;

public class ChooseVar1 implements Command {
    private SessionRunner sessionRunner;


    public ChooseVar1(SessionRunner sessionRunner) {
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        sessionRunner.chooseVar1();
    }

    @Override
    public String getName() {
        return sessionRunner.getVar1Name();
    }
}
