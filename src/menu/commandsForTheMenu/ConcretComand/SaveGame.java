package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class SaveGame implements Command {
    Game game;

    public SaveGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.saveGame();
    }


}
