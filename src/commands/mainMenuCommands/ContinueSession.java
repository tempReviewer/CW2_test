package commands.mainMenuCommands;

import game.GameCommands;
import commands.abstracts.Command;
import game.SessionCommands;
import menu.Menu;

public class ContinueSession implements Command {
    private GameCommands gameCommands;
    private SessionCommands sessionCommands;
    private Menu menu;

    public ContinueSession(GameCommands gameCommands,SessionCommands sessionCommands,Menu menu) {
        this.gameCommands = gameCommands;
        this.menu=menu;
        this.sessionCommands=sessionCommands;
    }

    @Override
    public void execute() {
        gameCommands.continueSession();
        menu.startSessionMenu(sessionCommands);
    }

    @Override
    public String getName() {
        return "Продолжить";
    }


}