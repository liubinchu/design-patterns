package top.ericcliu.actional.memento;

/**
 * @author liubi
 **/
//存储备忘录的类
public class Caretaker
{
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
