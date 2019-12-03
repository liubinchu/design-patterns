package top.ericcliu.actional.mediator;

/**
 * @author liubi
 **/
public abstract class Person
{
    AbstractMediator abstractMediator;
    public Person(AbstractMediator abstractMediator)
    {
        this.abstractMediator = abstractMediator;
    }

    public abstract void send(String message);

    public abstract void notify(String message);
}
