package menu.commandsForTheMenu.ConcretComand;

import game.Game;
import menu.commandsForTheMenu.Command;

public class ChooseVar1 implements Command {
        Game game;

        public ChooseVar1(Game game) {
            this.game = game;
        }

        @Override
        public void execute() {
            game.chooseVar1();
        }


}
