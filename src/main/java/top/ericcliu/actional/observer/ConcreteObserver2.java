package top.ericcliu.actional.observer;

/**
 * @author liubi
 **/
public class ConcreteObserver2 implements Observer{

    public ConcreteObserver2(AbstractSubject subject) {
        subject.registerObserver( this);
    }


    @Override
    public void update(Object[] args) {
        StringBuilder sb = new StringBuilder("ConcreteObserver2: ");
        for (Object o : args){
            sb.append(o.toString());
        }
        System.out.println(sb.toString());
    }
}
