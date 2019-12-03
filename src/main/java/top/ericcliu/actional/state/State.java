package top.ericcliu.actional.state;

/**
 * @author liubi
 **/
public interface State {
    void handler(Worker worker);
}
