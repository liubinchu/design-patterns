package top.ericcliu.actional.visitor;

/**
 * @author liubi
 **/
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitConcreteElementB(this);
    }
}
