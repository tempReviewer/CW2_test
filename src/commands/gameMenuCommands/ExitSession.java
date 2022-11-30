package commands.gameMenuCommands;

import game.GameCommands;
import commands.abstracts.Command;
import game.SessionCommands;

public class ExitSession implements Command {
    SessionCommands sessionCommands;

    public ExitSession(SessionCommands sessionCommands) {
        this.sessionCommands = sessionCommands;
    }

    @Override
    public void execute() {
        sessionCommands.exitSession();
    }

    @Override
    public String getName() {
        return "Выйти в меню";
    }


}
