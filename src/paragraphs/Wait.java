package paragraphs;

import paragraphs.abstracts.Paragraph;

public class Wait extends Paragraph {
    public Wait() {
        name = "Подождать, вдруг пчёлы улетят";
        text = "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. \n" +
                "Вдруг он понял, что очень голоден. Что же делать?";
    }
    @Override
    public void createVariants() {
        var1 = new EatAndRest();
        var2 = new TakeHoneyToTheBear();
    }
}
