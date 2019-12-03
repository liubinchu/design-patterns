package top.ericcliu.actional.mediator;

/**
 * @author liubi
 **/
public class Person1 extends Person{
    public Person1(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    @Override
    public void send(String message) {
        super.abstractMediator.send(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("P1 Get Message: "+message);
    }
}
