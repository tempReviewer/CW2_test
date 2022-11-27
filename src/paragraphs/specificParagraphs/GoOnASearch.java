package paragraphs.specificParagraphs;

import paragraphs.Paragraph;

public class GoOnASearch extends Paragraph {

    public GoOnASearch() {
        name = "Отправиться на поиски";
        text = "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. \n" +
                "Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.";
    }
    @Override
    public void createVariants() {
        var1 = new TryToFindOut();
        var2 = new LookingForASquirrel();

    }
}
