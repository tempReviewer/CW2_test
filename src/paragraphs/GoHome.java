package paragraphs;

import paragraphs.abstracts.Paragraph;

public  class GoHome extends Paragraph {


    public GoHome() {
        name = "Вернуться домой";
        text = "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, \n" +
                "что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
                "Он поспешил предупредить об этом Лисёнка, но они разминулись. \n" +
                "Наконец-то друзья нашли друг друга! Игра завершилась успехом";
    }
    @Override
    public void createVariants() {

    }
}
