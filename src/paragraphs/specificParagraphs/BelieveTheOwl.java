package paragraphs.specificParagraphs;

import paragraphs.Paragraph;

public class BelieveTheOwl extends Paragraph {
    public BelieveTheOwl() {
        name = "Поверить Сове и отправиться вглубь леса";
        text = "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов \n" +
                "рассказать все, что знает, если Лисёнок принесёт ему мёда.";
    }
    @Override
    public void createVariants() {
        var1 = new LookingForASquirrel();
        var2 = new GetHoney();
    }
}
