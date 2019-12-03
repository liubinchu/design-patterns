package top.ericcliu.actional.templateMethod;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args) {
        TemplateOperation operation = new ConcreteOperation();
        operation.templateMethod();
    }
}
