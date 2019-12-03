package top.ericcliu.actional.strategy;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        Worker worker = new ConcreteWorker(new ConcreteStrategy1());
        worker.work(new Object[]{1,2,3});
        worker.setStrategy(new ConcreteStrategy2());
        worker.work(new Object[]{1,2,3});
    }
}
