package top.ericcliu.creational.factoryMethod;



/**
 * @author liubi
 **/
public class ConcreteFactory1 {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
