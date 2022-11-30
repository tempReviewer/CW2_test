package commands.mainMenuCommands;

import game.GameCommands;
import commands.abstracts.Command;

public class SaveSession implements Command {
    GameCommands gameCommands;

    public SaveSession(GameCommands gameCommands) {
        this.gameCommands = gameCommands;
    }

    @Override
    public void execute() {
        gameCommands.saveSession();
    }

    @Override
    public String getName() {
        return "Сохранить игру";
    }


}
