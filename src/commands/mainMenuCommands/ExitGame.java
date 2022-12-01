package commands.mainMenuCommands;

import game.runners.GameRunner;
import commands.abstracts.Command;

public class ExitGame implements Command {
    GameRunner gameRunner;

    public ExitGame(GameRunner gameRunner) {
        this.gameRunner = gameRunner;
    }

    @Override
    public void execute() {
        gameRunner.exitGame();
    }

    @Override
    public String getName() {
        return "Выйти";
    }

}
