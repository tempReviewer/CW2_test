package commands.gameMenuCommands;

import commands.abstracts.Command;
import game.runners.SessionRunner;

public class ChooseVar2 implements Command {
    SessionRunner sessionRunner;

    public ChooseVar2(SessionRunner sessionRunner) {
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        sessionRunner.chooseVar2();
    }

    @Override
    public String getName() {
        return sessionRunner.getVar2Name();
    }

}
