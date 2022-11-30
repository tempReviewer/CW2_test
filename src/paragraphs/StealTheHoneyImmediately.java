package paragraphs;

import paragraphs.abstracts.Paragraph;

public class StealTheHoneyImmediately extends Paragraph {
    public StealTheHoneyImmediately() {
        name = "Нужно попытаться выкрасть мёд немедленно";
        text = "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. \n" +
                "Игра завершилась неудачей";

    }
    @Override
    public void createVariants() {}
}
