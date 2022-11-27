package paragraphs.specificParagraphs;

import paragraphs.Paragraph;

public class AskTheOwl extends Paragraph {

    public AskTheOwl() {
        name = "Расспросить Сову";
        text = "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, \n" +
                "бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если \n" +
                "Бельчонок там, ему срочно нужна помощь.";
    }
    @Override
    public void createVariants() {
        var1 = new BelieveTheOwl();
        var2 = new LookingForASquirrel();
    }
}
