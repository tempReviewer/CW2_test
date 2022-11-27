package menu.commandsForTheMenu.ConcretComand;
import game.Game;
import menu.commandsForTheMenu.Command;


public class StartGame implements Command {
    private Game game;


    public StartGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.startNewGame();
    }


}

