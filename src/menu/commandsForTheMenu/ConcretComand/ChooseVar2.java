package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class ChooseVar2 implements Command {
    Game game;

    public ChooseVar2(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.chooseVar2();
    }

}
