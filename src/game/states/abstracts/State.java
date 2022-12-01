package game.states.abstracts;

public abstract class State {
    protected boolean active;
    public void setActive(boolean active){
        this.active=active;
    }
    public boolean isActive(){ return  active;}
}
