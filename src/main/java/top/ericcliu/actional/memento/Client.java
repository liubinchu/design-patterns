package top.ericcliu.actional.memento;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("start");
        originator.printState();
        //保存状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("stop");
        originator.printState();
        //恢复状态
        originator.setMemento(caretaker.getMemento());
        originator.printState();
    }
}
