package menu;

import commands.abstracts.Command;
import commands.gameMenuCommands.ChooseVar1;
import commands.gameMenuCommands.ChooseVar2;
import commands.gameMenuCommands.ExitSession;
import commands.mainMenuCommands.*;
import game.GameCommands;
import game.GameState;
import game.SessionCommands;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final GameState gameState;
    private Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
    public Menu(GameState gameState){
        this.gameState=gameState;
    }
    public void updateCommands(Map<Integer, Command> commandMap) {
        this.commandMap = commandMap;
    }

    public Map<Integer, Command> gameMenuCommands(GameCommands gameCommands, SessionCommands sessionCommands) {
        Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
        int i = 0;
        commandMap.put(++i, new StartNewSession(gameCommands,sessionCommands,this));
        if (gameState.isStarted()) {
            commandMap.put(++i, new ContinueSession(gameCommands,sessionCommands,this));
            commandMap.put(++i, new SaveSession(gameCommands));
        }
        commandMap.put(++i, new LoadSession(gameCommands,sessionCommands,this));
        commandMap.put(++i, new ExitGame(gameCommands));
        return commandMap;
    }

    public Map<Integer, Command> sessionMenuCommands(SessionCommands sessionCommands) {
        Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
        int i = 0;
        if ((sessionCommands.getVar1Name() != null) && (sessionCommands.getVar2Name() != null)) {
            commandMap.put(++i, new ChooseVar1(sessionCommands));
            commandMap.put(++i, new ChooseVar2(sessionCommands));
        } else {
            sessionCommands.finishSession();
        }
        commandMap.put(++i, new ExitSession(sessionCommands));
        return commandMap;
    }

    public void drawMenu() {
        for (int i = 1; i < commandMap.size() + 1; i++) {
            System.out.println(i + " - " + commandMap.get(i).getName());
        }
    }

    public void checkAnswer(Scanner scanner) {
        int answer = scanner.nextInt();
        for (int i = 1; i < commandMap.size() + 1; i++) {
            if (answer == i) {
                commandMap.get(answer).execute();
            }
        }
    }

    public void startGameMenu(GameCommands gameCommands, SessionCommands sessionCommands) {
        Scanner scanner = new Scanner(System.in);
        while (gameState.isGameActive()) {
            updateCommands(gameMenuCommands(gameCommands, sessionCommands));
            drawMenu();
            checkAnswer(scanner);
        }
    }

    public void startSessionMenu(SessionCommands sessionCommands) {
        Scanner scanner = new Scanner(System.in);
        while (gameState.isSessionActive()) {
            updateCommands(sessionMenuCommands(sessionCommands));
            drawMenu();
            checkAnswer(scanner);
        }
    }
}
