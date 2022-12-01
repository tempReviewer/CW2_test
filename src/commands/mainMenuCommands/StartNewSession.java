package commands.mainMenuCommands;
import commands.abstracts.Command;
import game.runners.GameRunner;
import game.runners.SessionRunner;
import menu.GameMenu;
import menu.SessionMenu;


public class StartNewSession implements Command {
    private SessionRunner sessionRunner;
    private GameRunner gameRunner;
    private SessionMenu sessionMenu;

    public StartNewSession(GameRunner gameRunner,SessionRunner sessionRunner, SessionMenu sessionMenu) {
        this.gameRunner=gameRunner;
        this.sessionMenu = sessionMenu;
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        sessionRunner.startNewSession();
        sessionMenu.startMenu(gameRunner,sessionRunner);
    }

    @Override
    public String getName() {
        return "Начать новую игру";
    }


}

