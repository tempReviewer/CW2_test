package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class ContinueGame implements Command {
    private Game game;

    public ContinueGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() { game.continueGame(); }


}