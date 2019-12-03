package top.ericcliu.actional.visitor;

/**
 * @author liubi
 **/
public class ConcreteVisitor1 extends Visitor
{
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(this.getClass()+" visit "+concreteElementA.getClass());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(this.getClass()+" visit "+concreteElementB.getClass());
    }

}
