package paragraphs;

import paragraphs.abstracts.Paragraph;

public class GetHoney extends Paragraph {

    public GetHoney() {
        name = "Нужно воспользоваться шансом и раздобыть мёд";
        text = "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. \n" +
                "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.";
    }
    @Override
    public void createVariants() {
        var1 = new Wait();
        var2 = new StealTheHoneyImmediately();
    }
}
