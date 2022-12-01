package menu;

import commands.abstracts.Command;
import commands.mainMenuCommands.*;
import game.runners.GameRunner;
import game.runners.SessionRunner;
import game.states.abstracts.State;
import menu.abstracts.Menu;

import java.util.HashMap;
import java.util.Map;

public class GameMenu extends Menu {

    private final SessionMenu sessionMenu;
    public GameMenu(SessionMenu sessionMenu,State state) {
        super(state);
        this.sessionMenu=sessionMenu;
    }

    @Override
    protected Map<Integer, Command> menuCommands(GameRunner gameRunner, SessionRunner sessionRunner) {
        Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
        int i = 0;
        commandMap.put(++i, new StartNewSession(gameRunner,sessionRunner,sessionMenu));
        if (sessionRunner.isStarted()) {
            commandMap.put(++i, new ContinueSession(gameRunner,sessionRunner,sessionMenu));
            commandMap.put(++i, new SaveSession(sessionRunner));
        }
        commandMap.put(++i, new LoadSession(gameRunner, sessionRunner,this));
        commandMap.put(++i, new ExitGame(gameRunner));
        return commandMap;
    }

}
