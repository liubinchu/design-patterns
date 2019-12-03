package top.ericcliu.actional.observer;

import java.util.Observable;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteSubject1 s1 = new ConcreteSubject1();
        ConcreteObserver1 o1 = new ConcreteObserver1(s1);
        ConcreteObserver2 o2 = new ConcreteObserver2(s1);

        s1.setInfos(new Object[]{1,2,3,4});
        s1.notifyObserver();
        s1.setInfos(new Object[]{4,5,6,7});
        s1.notifyObserver();
    }
}

