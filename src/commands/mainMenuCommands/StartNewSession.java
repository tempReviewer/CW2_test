package commands.mainMenuCommands;
import game.GameCommands;
import commands.abstracts.Command;
import game.SessionCommands;
import menu.Menu;


public class StartNewSession implements Command {
    private GameCommands gameCommands;
    private SessionCommands sessionCommands;
    private Menu menu;


    public StartNewSession(GameCommands gameState, SessionCommands sessionCommands, Menu menu) {
        this.gameCommands = gameState;
        this.menu=menu;
        this.sessionCommands=sessionCommands;
    }

    @Override
    public void execute() {
        gameCommands.startNewSession();
        menu.startSessionMenu(sessionCommands);
    }

    @Override
    public String getName() {
        return "Начать новую игру";
    }


}

