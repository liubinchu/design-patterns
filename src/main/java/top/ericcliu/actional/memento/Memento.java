package top.ericcliu.actional.memento;

/**
 * @author liubi
 **/
public class Memento
{
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}
