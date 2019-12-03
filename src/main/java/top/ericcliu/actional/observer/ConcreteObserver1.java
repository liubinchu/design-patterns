package top.ericcliu.actional.observer;

/**
 * @author liubi
 **/
public class ConcreteObserver1 implements Observer{
    public ConcreteObserver1(AbstractSubject subject) {
        subject.registerObserver( this);
    }


    @Override
    public void update(Object[] args) {
        StringBuilder sb = new StringBuilder("ConcreteObserver1: ");
        for (Object o : args){
            sb.append(o.toString());
        }
        System.out.println(sb.toString());
    }
}
