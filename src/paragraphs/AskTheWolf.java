package paragraphs;

import paragraphs.abstracts.Paragraph;

public class AskTheWolf extends Paragraph {
    public AskTheWolf() {
        name = "Расспросить Волка";
        text = "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, \n" +
                "что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?";
    }

    @Override
    public void createVariants() {
        var1 = new GoHome();
        var2 = new LookingForASquirrel();
    }
}
