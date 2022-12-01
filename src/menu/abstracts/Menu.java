package menu.abstracts;

import commands.abstracts.Command;
import game.runners.GameRunner;
import game.runners.SessionRunner;
import game.states.abstracts.State;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Menu {
    protected final State state;
    protected Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
    public Menu(State state){ this.state=state;}
    protected void updateCommands(Map<Integer, Command> commandMap) {
        this.commandMap = commandMap;
    }
    protected abstract Map<Integer, Command> menuCommands(GameRunner gameRunner, SessionRunner sessionRunner);
    protected void drawMenu() {
        for (int i = 1; i < commandMap.size() + 1; i++) {
            System.out.println(i + " - " + commandMap.get(i).getName());
        }
    }
    protected void checkAnswer(Scanner scanner) {
        int answer = scanner.nextInt();
        for (int i = 1; i < commandMap.size() + 1; i++) {
            if (answer == i) {
                commandMap.get(answer).execute();
            }
        }
    }
    public void startMenu(GameRunner gameRunner, SessionRunner sessionRunner) {
        Scanner scanner = new Scanner(System.in);
        while (state.isActive()) {
            updateCommands(menuCommands(gameRunner, sessionRunner));
            drawMenu();
            checkAnswer(scanner);
        }
    }
}
