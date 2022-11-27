package game;

//ресивер

import game.binH.BinHandler;
import menu.commandsForTheMenu.Menu;
import paragraphs.Paragraph;
import paragraphs.specificParagraphs.Foxy;

public class Game {


    public Paragraph CurrentParagraph;
    private boolean sessionActive = false;
    private boolean gameActive = true;
    private Menu menu = new Menu();


    public void finishGame() {
        CurrentParagraph = null;
    }

    public void startNewGame() {
        CurrentParagraph = new Foxy();
        System.out.println(CurrentParagraph);
        CurrentParagraph.createVariants();
        sessionActive = true;
        Menu menu = new Menu();
        menu.startGameMenu(this);
    }

    public boolean isStarted() {
        return CurrentParagraph != null;
    }


    public void startGame() {
        menu.startMenu(this);
    }


    public void exitGame() {

        System.out.println("Вы можете пойти и наконец-то заняться чем-нибудь полезным");
        gameActive = false;
    }

    public void saveGame() {
        BinHandler<Paragraph> paragraphSave = new BinHandler<>();
        paragraphSave.writeToFile(CurrentParagraph);
        System.out.println("Игра сохранена");
    }

    public void loadGame() {
        BinHandler<Paragraph> paragraphLoad = new BinHandler<>();
        CurrentParagraph = paragraphLoad.readFromFile();
        sessionActive = true;
        System.out.println("Игра загружена");
        menu.startMenu(this);
    }

    public void continueGame() {
        System.out.println(CurrentParagraph);
        CurrentParagraph.createVariants();
        sessionActive = true;
        menu.startGameMenu(this);
    }

    public boolean isSessionActive() {
        return sessionActive;
    }

    public boolean isGameActive() {
        return gameActive;
    }

    public void chooseVar1() {
        CurrentParagraph = CurrentParagraph.chooseVar1();
        CurrentParagraph.createVariants();
        System.out.println(CurrentParagraph);
    }

    public void chooseVar2() {
        CurrentParagraph = CurrentParagraph.chooseVar2();
        CurrentParagraph.createVariants();
        System.out.println(CurrentParagraph);
    }

    public void exitSession() {
        sessionActive = false;
    }
}

