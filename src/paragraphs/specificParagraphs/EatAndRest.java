package paragraphs.specificParagraphs;

import paragraphs.Paragraph;

public class EatAndRest extends Paragraph {
    public EatAndRest() {
        name = "Поесть немного и передохнуть";
        text = "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. \n" +
                "Лисёнку нужна помощь, он не сможет продолжить поиски. \n" +
                "Игра завершилась неудачей";
    }
    @Override
    public void createVariants() {

    }
}
