package menu.commandsForTheMenu;

import game.Game;
import menu.commandsForTheMenu.ConcretComand.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private Map<String, Command> commandMap = new HashMap<String, Command>();

    public void updateCommands(Map<String, Command> commandMap) {
        this.commandMap = commandMap;
    }

    public Map<String, Command> mainMenuCommands(Game game) {
        Map<String, Command> commandMap = new HashMap<String, Command>();
        int i = 0;

        Command startGame = new StartGame(game);
        commandMap.put(++i + " - Начать новую игру ", startGame);
        if (game.isStarted()) {
            Command continueGame = new ContinueGame(game);
            commandMap.put(++i + " - Продолжить игру ", continueGame);
            Command saveGame = new SaveGame(game);
            commandMap.put(++i + " - Сохранить игру ", saveGame);
        }
        Command loadGame = new LoadGame(game);
        commandMap.put(++i + " - Загрузить игру ", loadGame);
        Command exitGame = new ExitGame(game);
        commandMap.put(++i + " - Выход ", exitGame);
        return commandMap;
    }

    public Map<String, Command> gameMenuCommands(Game game) {
        Map<String, Command> commandMap = new HashMap<String, Command>();
        int i = 0;
        if (!(game.CurrentParagraph.var1 == null) && !(game.CurrentParagraph.var2 == null)) {
            Command chooseVar1 = new ChooseVar1(game);
            commandMap.put(++i + " - " + game.CurrentParagraph.var1.name + " ", chooseVar1);
            Command chooseVar2 = new ChooseVar2(game);
            commandMap.put( ++i +" - " + game.CurrentParagraph.var2.name + " ", chooseVar2);
        }
        else {
            game.finishGame();
        }
            Command exitSession = new ExitSession(game);
            commandMap.put(++i +" - Выйти в меню ", exitSession);
        return commandMap;
    }

    public void drawMenu() {
        for (int i = 0; i < commandMap.size(); i++) {
            for (String s : commandMap.keySet()) {
                if (s.contains((i + 1) + " ")) System.out.println(s);
            }
        }
    }

    public void checkAnswer(Scanner scanner) {
        String answer = scanner.nextLine();
        for (String s : commandMap.keySet()) {
            if (s.contains(answer + " ")) {
                commandMap.get(s).execute();
                break;
            }
        }
    }

    public void startMenu(Game game) {
        Scanner scanner = new Scanner(System.in);
        while (game.isGameActive()) {
            updateCommands(mainMenuCommands(game));
            drawMenu();
            checkAnswer(scanner);
        }
    }

    public void startGameMenu(Game game) {
        Scanner scanner = new Scanner(System.in);
        while (game.isSessionActive()) {
            updateCommands(gameMenuCommands(game));
            drawMenu();
            checkAnswer(scanner);
        }
    }
}
