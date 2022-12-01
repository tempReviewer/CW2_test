package menu;

import commands.abstracts.Command;
import commands.gameMenuCommands.ChooseVar1;
import commands.gameMenuCommands.ChooseVar2;
import commands.gameMenuCommands.ExitSession;
import game.runners.GameRunner;
import game.runners.SessionRunner;
import game.states.abstracts.State;
import menu.abstracts.Menu;

import java.util.HashMap;
import java.util.Map;

public class SessionMenu extends Menu {
    public SessionMenu(State state) {
        super(state);
    }

    @Override
    protected Map<Integer, Command> menuCommands(GameRunner gameRunner, SessionRunner sessionRunner) {
        Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
        int i = 0;
        if ((sessionRunner.getVar1Name() != null) && (sessionRunner.getVar2Name() != null)) {
            commandMap.put(++i, new ChooseVar1(sessionRunner));
            commandMap.put(++i, new ChooseVar2(sessionRunner));
        } else {
            sessionRunner.finishSession();
        }
        commandMap.put(++i, new ExitSession(sessionRunner));
        return commandMap;
    }
}
