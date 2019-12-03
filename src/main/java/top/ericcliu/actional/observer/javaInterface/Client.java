package top.ericcliu.actional.observer.javaInterface;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        //给这个被观察者添加观察者，允许添加多個观察者
        subject.setData(2);
        subject.setData(-5);
        subject.setData(9999);
    }
}
