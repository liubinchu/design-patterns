package top.ericcliu.structural.decorator;

public class Client {
    public static void main (String args[])
    {
        Component concreteComponent = new ConcreteComponent();
        Decorator a = new DecoratorA();
        Decorator b = new DecoratorB();
        a.setComponent(concreteComponent);
        //体现装饰模式优势的地方来了
        b.setComponent(a);
        // use
        b.Operation();
    }
}