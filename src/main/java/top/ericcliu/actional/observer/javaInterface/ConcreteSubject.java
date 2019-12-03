package top.ericcliu.actional.observer.javaInterface;

import java.util.Observable;

/**
 * @author liubi
 **/
public class ConcreteSubject extends Observable {
    int data = 0;

    public void setData(int data){
        this.data = data;
        this.setChanged();
        //标记此 Observable对象为已改变的对象
        this.notifyObservers(new Object());
        //通知所有的观察者
    }

    @Override
    public String toString() {
        return "ConcreteSubject{" +
                "data=" + data +
                '}';
    }
}
