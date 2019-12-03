package top.ericcliu.actional.mediator;

import java.util.concurrent.locks.Condition;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args){
     ConcreteMediator mediator = new ConcreteMediator();
     Person p1 = new Person1(mediator);
     Person p2 = new Person2(mediator);

     mediator.setP1(p1);
     mediator.setP2(p2);

     p1.send("p1 send message : p1 message");
     p2.send("p2 send message : p2 message");
    }
}
