package paragraphs;

import java.io.Serializable;

abstract public class Paragraph implements Serializable {
    public String name;
    public String text;
    public Paragraph var1;
    public Paragraph var2;

    public abstract void createVariants();
    public Paragraph chooseVar1(){return var1;}
    public Paragraph chooseVar2(){return var2;}



    @Override
    public String toString() {
        return text;
    }
}
