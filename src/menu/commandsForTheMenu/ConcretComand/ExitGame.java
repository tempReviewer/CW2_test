package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class ExitGame implements Command {
    Game game;

    public ExitGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exitGame();
    }

}
