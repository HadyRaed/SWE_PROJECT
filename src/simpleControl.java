
public class simpleControl {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }
    public void buttonWasPressed()
    {
        slot.execute();
    }
}
 