import game.runners.GameRunner;
import game.states.GameState;
import game.runners.SessionRunner;
import game.states.SessionState;
import menu.GameMenu;
import menu.SessionMenu;

public class Main {
    public static void main(String[] args) {
        GameState gameState=new GameState();
        SessionState sessionState=new SessionState();
        GameRunner gameRunner = new GameRunner(gameState);
        SessionRunner sessionRunner = new SessionRunner(sessionState);
        SessionMenu sessionMenu=new SessionMenu(sessionState);
        GameMenu gameMenu = new GameMenu(sessionMenu,gameState);
        gameRunner.startGame(sessionRunner, gameMenu);
    }
}