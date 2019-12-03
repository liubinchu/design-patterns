package top.ericcliu.actional.visitor;

/**
 * @author liubi
 **/
public abstract class Visitor
{
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
