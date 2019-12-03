package top.ericcliu.creational.reflectAbstractFactory;

/**
 * @author liubi
 **/
public class ReflectAbstractFactory {
    private String concreateFactory;
    public ReflectAbstractFactory(String concreateFactory)
    {
        this.concreateFactory = concreateFactory;
    }

    public AbstractProductA createProductA() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
         Class<AbstractProductA> clazz = (Class<AbstractProductA>) Class.forName("top.ericcliu.creational.reflectAbstractFactory.ProductA"+concreateFactory);
        return  clazz.newInstance();
    }

    public AbstractProductB createProductB() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (AbstractProductB) Class.forName("top.ericcliu.creational.reflectAbstractFactory.ProductB"+concreateFactory).newInstance();
    }
}
