import game.GameCommands;
import game.GameState;
import game.SessionCommands;
import menu.Menu;

public class Main {
    public static void main(String[] args) {
        GameState gameState=new GameState();
        GameCommands gameCommands = new GameCommands(gameState);
        SessionCommands sessionCommands = new SessionCommands(gameState);
        Menu menu = new Menu(gameState);
        gameCommands.startGame(sessionCommands,menu);
    }
}