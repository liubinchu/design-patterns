package top.ericcliu.actional.visitor;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());

        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

        objectStructure.Accept(concreteVisitor1);
        objectStructure.Accept(concreteVisitor2);
    }
}
