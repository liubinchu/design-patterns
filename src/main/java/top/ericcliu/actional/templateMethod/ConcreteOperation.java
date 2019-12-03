package top.ericcliu.actional.templateMethod;

/**
 * @author liubi
 **/
public class ConcreteOperation extends TemplateOperation {

    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteOperation primitiveOperation1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteOperation primitiveOperation2");

    }
}
