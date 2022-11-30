package commands.gameMenuCommands;

import game.GameCommands;
import commands.abstracts.Command;
import game.SessionCommands;

public class ChooseVar2 implements Command {
    SessionCommands sessionCommands;

    public ChooseVar2(SessionCommands sessionCommands) {
        this.sessionCommands = sessionCommands;
    }

    @Override
    public void execute() {
        sessionCommands.chooseVar2();
    }

    @Override
    public String getName() {
        return sessionCommands.getVar2Name();
    }

}
