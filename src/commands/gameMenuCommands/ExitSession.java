package commands.gameMenuCommands;

import commands.abstracts.Command;
import game.runners.SessionRunner;

public class ExitSession implements Command {
    SessionRunner sessionRunner;

    public ExitSession(SessionRunner sessionRunner) {
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        sessionRunner.exitSession();
    }

    @Override
    public String getName() {
        return "Выйти в меню";
    }


}
