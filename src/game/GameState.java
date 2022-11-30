package game;

//ресивер

import menu.Menu;
import paragraphs.abstracts.Paragraph;

public class GameState {

    private Paragraph CurrentParagraph;
    private boolean sessionActive = false;
    private boolean gameActive = true;
//    public Menu menu = new Menu(this, sessionCommands);

    public Paragraph getCurrentParagraph(){
        return CurrentParagraph;
    }

    public void setCurrentParagraph(Paragraph paragraph){
        CurrentParagraph=paragraph;
    }

    public void setSessionActive(boolean sessionActive) {
        this.sessionActive = sessionActive;
    }

    public void setGameActive(boolean gameActive) {
        this.gameActive = gameActive;
    }

    public boolean isStarted() {
        return CurrentParagraph != null;
    }

    public boolean isSessionActive() {
        return sessionActive;
    }

    public boolean isGameActive() {
        return gameActive;
    }

}

