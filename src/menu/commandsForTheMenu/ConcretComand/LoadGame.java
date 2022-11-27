package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class LoadGame implements Command {
    Game game;


    public LoadGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.loadGame();
    }


}
