package top.ericcliu.actional.state;

/**
 * @author liubi
 **/
public class Worker {
    public State currentState;

    public Worker(State state)
    {
        this.currentState = state;
    }

    public void Request()
    {
        currentState.handler(this);
    }
}
