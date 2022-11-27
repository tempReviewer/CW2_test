package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class ExitSession implements Command {
    Game game;

    public ExitSession(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exitSession();
    }


}
