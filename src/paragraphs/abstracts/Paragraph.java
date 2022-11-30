package paragraphs.abstracts;

import java.io.Serializable;

abstract public class Paragraph implements Serializable {
    protected String name;
    protected String text;
    protected Paragraph var1;
    protected Paragraph var2;

    public abstract void createVariants();

    public String getName() {
        return name;
    }

    public Paragraph getVar1() {
        return var1;
    }

    public Paragraph getVar2() {
        return var2;
    }

    public String getVar1Name(){
        if(var1==null) return null;
        return var1.name;
    }
    public String getVar2Name(){
        if(var2==null) return null;
        return var2.name;
    }
    @Override
    public String toString() {
        return text;
    }
}
