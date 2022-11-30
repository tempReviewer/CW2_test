package commands.mainMenuCommands;

import game.GameCommands;
import game.GameState;
import commands.abstracts.Command;

public class ExitGame implements Command {
    GameCommands gameCommands;

    public ExitGame(GameCommands gameCommands) {
        this.gameCommands = gameCommands;
    }

    @Override
    public void execute() {
        gameCommands.exitGame();
    }

    @Override
    public String getName() {
        return "Выйти";
    }

}
