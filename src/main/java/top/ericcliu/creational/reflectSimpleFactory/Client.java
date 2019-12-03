package top.ericcliu.creational.reflectSimpleFactory;


/**
 * @author liubi
 **/
public class Client
{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
  // System.out.println(Product1.class.getName());
    AbstractProduct product = Factory.getInstance("top.ericcliu.creational.reflectSimpleFactory.Product1");
    }
}
