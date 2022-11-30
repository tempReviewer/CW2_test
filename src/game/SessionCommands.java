package game;

import paragraphs.Foxy;

public class SessionCommands {
    private GameState gameState;

    public SessionCommands(GameState gameState) {
        this.gameState = gameState;
    }

    public void chooseVar1() {
        gameState.setCurrentParagraph(gameState.getCurrentParagraph().getVar1());
        gameState.getCurrentParagraph().createVariants();
        System.out.println(gameState.getCurrentParagraph());
    }

    public void chooseVar2() {
        gameState.setCurrentParagraph(gameState.getCurrentParagraph().getVar2());
        gameState.getCurrentParagraph().createVariants();
        System.out.println(gameState.getCurrentParagraph());
    }
    public String getVar1Name() {
        return gameState.getCurrentParagraph().getVar1Name();
    }

    public String getVar2Name() {
        return gameState.getCurrentParagraph().getVar2Name();
    }
    public void exitSession() {
        gameState.setSessionActive(false);
    }
    public void finishSession() {
        gameState.setCurrentParagraph(null);
    }
}
