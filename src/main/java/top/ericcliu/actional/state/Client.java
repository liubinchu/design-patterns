package top.ericcliu.actional.state;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        Worker worker = new Worker(new ConcreteStateA());
        worker.Request();
    }
}
