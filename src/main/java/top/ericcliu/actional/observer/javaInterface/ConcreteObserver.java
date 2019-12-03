package top.ericcliu.actional.observer.javaInterface;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liubi
 **/
public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("example.data changed, the new value  is " + o.toString());
    }

    @Override
    public String toString() {
        return "ConcreteObserver{}";
    }
}
