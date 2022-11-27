package paragraphs.specificParagraphs;

import paragraphs.Paragraph;

public class TryToFindOut extends Paragraph {
    public TryToFindOut() {
        name = "Попытаться разузнать о Бельчонке у лесных жителей";
        text = "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. \n" +
                "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?";
    }
    @Override
    public void createVariants() {
        var1 = new AskTheOwl();
        var2 = new AskTheWolf();
    }
}
