package commands.mainMenuCommands;

import game.runners.GameRunner;
import commands.abstracts.Command;
import game.storage.SaveStorage;
import game.runners.SessionRunner;
import menu.GameMenu;

public class LoadSession implements Command {
    private GameRunner gameRunner;
    private GameMenu gameMenu;
    private SessionRunner sessionRunner;

    public LoadSession(GameRunner gameRunner,SessionRunner sessionRunner, GameMenu gameMenu) {
        this.gameRunner = gameRunner;
        this.gameMenu = gameMenu;
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        //не знаю, стоит ли создавать поле SaveStorage и передавать его в конструкторе,
        // так что пока сделал так
        new SaveStorage().loadSession(sessionRunner.getSessionState());
        gameMenu.startMenu(gameRunner, sessionRunner);
    }

    @Override
    public String getName() {
        return "Загрузить игру";
    }
}
