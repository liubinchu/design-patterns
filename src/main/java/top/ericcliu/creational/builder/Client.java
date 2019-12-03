package top.ericcliu.creational.builder;

/**
 * @author liubi
 **/
public class Client {
    public static void main()
    {
        Director director = new Director();
        ConcreteBuilder1 b1 = new ConcreteBuilder1();
        ConcreteBuilder2 b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getProduct();

        director.Construct(b1);
        Product p2 = b2.getProduct();
    }
}
