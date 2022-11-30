package commands.mainMenuCommands;

import game.GameCommands;
import commands.abstracts.Command;
import game.SessionCommands;
import menu.Menu;

public class LoadSession implements Command {
    private GameCommands gameCommands;
    private Menu menu;
    private SessionCommands sessionCommands;

    public LoadSession(GameCommands gameCommands, SessionCommands sessionCommands, Menu menu) {
        this.gameCommands = gameCommands;
        this.menu=menu;
        this.sessionCommands=sessionCommands;
    }

    @Override
    public void execute() {
        gameCommands.loadSession();
        menu.startGameMenu(gameCommands,sessionCommands);
    }

    @Override
    public String getName() {
        return "Загрузить игру";
    }


}
