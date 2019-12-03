package top.ericcliu.actional.mediator;

/**
 * @author liubi
 **/
public class Person2 extends Person{
    public Person2(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    @Override
    public void send(String message) {
        super.abstractMediator.send(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("P2 Get Message: "+message);
    }
}
