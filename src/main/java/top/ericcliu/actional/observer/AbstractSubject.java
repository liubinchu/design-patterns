package top.ericcliu.actional.observer;

/**
 * @author liubi
 **/
public interface AbstractSubject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
