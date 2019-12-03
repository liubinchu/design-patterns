package top.ericcliu.actional.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author liubi
 **/
public class ConcreteSubject1 implements AbstractSubject {
    private List<Observer> observers;
    private Object[] infos;

    public ConcreteSubject1() {
        observers = new ArrayList<>();
    }

    public void setInfos(Object[] infos) {
        this.infos = infos;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(infos);
        }
    }
}
