package top.ericcliu.actional.memento;

/**
 * @author liubi
 **/
//生成备忘录的类
// 使用类
public class Originator
{
    private String state;

    public void setState(String state)
    {
        this.state = state;
    }

    public void printState()
    {
        System.out.println(state);
    }

    public Memento createMemento()
    {
        return new Memento(state);
    }

    public void setMemento(Memento memento)
    {
        state = memento.getState();
    }
}
