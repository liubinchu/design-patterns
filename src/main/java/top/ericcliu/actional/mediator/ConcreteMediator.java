package top.ericcliu.actional.mediator;

/**
 * @author liubi
 **/
public class ConcreteMediator extends AbstractMediator {
    private Person p1;
    private Person p2;
    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    @Override
    public void send(String message, Person person) {
        // TODO Auto-generated method stub
        // p1 与 p2 之间的通信
        if (person == p1)
        {
            p2.notify(message);
        }
        else
        {
            p1.notify(message);
        }
    }
}
