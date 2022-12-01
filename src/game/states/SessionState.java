package game.states;

import game.states.abstracts.State;
import paragraphs.abstracts.Paragraph;

public class SessionState extends State {
    private Paragraph CurrentParagraph;
    public Paragraph getCurrentParagraph(){
        return CurrentParagraph;
    }
    public void setCurrentParagraph(Paragraph paragraph){
        CurrentParagraph=paragraph;
    }
}
