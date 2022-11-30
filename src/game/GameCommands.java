package game;

import game.binH.BinHandler;
import menu.Menu;
import paragraphs.Foxy;
import paragraphs.abstracts.Paragraph;

public class GameCommands {
    private final GameState gameState;

    public GameCommands(GameState gameState) {
        this.gameState = gameState;
    }

    public void startNewSession() {
        gameState.setCurrentParagraph(new Foxy());
        System.out.println(gameState.getCurrentParagraph());
        gameState.getCurrentParagraph().createVariants();
        gameState.setSessionActive(true);
        //gameState.menu.startGameMenu(new SessionCommands(gameState));
    }

    public void startGame(SessionCommands sessionCommands,Menu menu) {
        menu.startGameMenu(this,sessionCommands);
    }


    public void exitGame() {
        System.out.println("Вы можете пойти и наконец-то заняться чем-нибудь полезным");
        gameState.setGameActive(false);
    }

    public void saveSession() {
        BinHandler<Paragraph> paragraphSave = new BinHandler<>();
        paragraphSave.writeToFile(gameState.getCurrentParagraph());
        System.out.println("Игра сохранена");
    }

    public void loadSession() {
        BinHandler<Paragraph> paragraphLoad = new BinHandler<>();
        gameState.setCurrentParagraph(paragraphLoad.readFromFile());
        System.out.println("Игра загружена");
        //gameState.menu.startMenu(this);
    }

    public void continueSession() {
        System.out.println(gameState.getCurrentParagraph());
        gameState.getCurrentParagraph().createVariants();
        gameState.setSessionActive(true);
        //gameState.menu.startGameMenu(new SessionCommands(gameState));
    }
}
