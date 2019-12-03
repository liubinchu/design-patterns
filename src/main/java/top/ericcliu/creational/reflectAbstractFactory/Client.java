package top.ericcliu.creational.reflectAbstractFactory;


/**
 * @author liubi
 **/
public class Client
{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
       ReflectAbstractFactory factory = new ReflectAbstractFactory("1");
        AbstractProductA productA1 = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
    }
}
