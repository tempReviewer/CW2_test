package game.runners;

import game.states.SessionState;
import paragraphs.Foxy;

public class SessionRunner {
    private SessionState sessionState;

    public SessionState getSessionState() {
        return sessionState;
    }

    public SessionRunner(SessionState sessionState) {
        this.sessionState = sessionState;
    }
    public boolean isStarted() {
        return sessionState.getCurrentParagraph() != null;
    }


    public void startNewSession() {
        sessionState.setCurrentParagraph(new Foxy());
        System.out.println(sessionState.getCurrentParagraph());
        sessionState.getCurrentParagraph().createVariants();
        sessionState.setActive(true);
    }
    public void continueSession() {
        System.out.println(sessionState.getCurrentParagraph());
        sessionState.getCurrentParagraph().createVariants();
        sessionState.setActive(true);
    }


    public void chooseVar1() {
        sessionState.setCurrentParagraph(sessionState.getCurrentParagraph().getVar1());
        sessionState.getCurrentParagraph().createVariants();
        System.out.println(sessionState.getCurrentParagraph());
    }

    public void chooseVar2() {
        sessionState.setCurrentParagraph(sessionState.getCurrentParagraph().getVar2());
        sessionState.getCurrentParagraph().createVariants();
        System.out.println(sessionState.getCurrentParagraph());
    }
    public String getVar1Name() {
        return sessionState.getCurrentParagraph().getVar1Name();
    }

    public String getVar2Name() {
        return sessionState.getCurrentParagraph().getVar2Name();
    }
    public void exitSession() {
        sessionState.setActive(false);
    }
    public void finishSession() {
        sessionState.setCurrentParagraph(null);
    }
}
