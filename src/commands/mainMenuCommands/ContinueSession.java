package commands.mainMenuCommands;

import commands.abstracts.Command;
import game.runners.GameRunner;
import game.runners.SessionRunner;
import menu.GameMenu;
import menu.SessionMenu;

public class ContinueSession implements Command {
    private SessionRunner sessionRunner;
    private GameRunner gameRunner;
    private SessionMenu sessionMenu;

    public ContinueSession(GameRunner gameRunner,SessionRunner sessionRunner, SessionMenu sessionMenu) {
        this.gameRunner=gameRunner;
        this.sessionMenu = sessionMenu;
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        sessionRunner.continueSession();
        sessionMenu.startMenu(gameRunner,sessionRunner);
    }

    @Override
    public String getName() {
        return "Продолжить";
    }


}