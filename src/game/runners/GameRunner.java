package game.runners;

import game.states.GameState;
import menu.GameMenu;

public class GameRunner {
    private final GameState gameState;

    public GameRunner(GameState gameState) {
        this.gameState = gameState;
    }


    public void startGame(SessionRunner sessionRunner, GameMenu gameMenu) {
        gameMenu.startMenu(this, sessionRunner);
    }


    public void exitGame() {
        System.out.println("Вы можете пойти и наконец-то заняться чем-нибудь полезным");
        gameState.setActive(false);
    }
}
