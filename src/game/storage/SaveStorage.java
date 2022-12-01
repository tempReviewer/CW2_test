package game.storage;

import game.storage.binH.BinHandler;
import game.states.SessionState;
import paragraphs.abstracts.Paragraph;

public class SaveStorage {
    public void saveSession(SessionState sessionState) {
        BinHandler<Paragraph> paragraphSave = new BinHandler<>();
        paragraphSave.writeToFile(sessionState.getCurrentParagraph());
        System.out.println("Игра сохранена");
    }

    public void loadSession(SessionState sessionState) {
        BinHandler<Paragraph> paragraphLoad = new BinHandler<>();
        sessionState.setCurrentParagraph(paragraphLoad.readFromFile());
        System.out.println("Игра загружена");
    }

}
