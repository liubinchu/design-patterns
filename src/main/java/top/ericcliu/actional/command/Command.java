package top.ericcliu.actional.command;

/**
 * @author liubi
 **/
public abstract class Command{
    public Command(Action[] actions) {
        this.actions = actions;
    }

    Action[] actions;
    abstract void execute();
}
