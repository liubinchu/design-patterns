package top.ericcliu.actional.templateMethod;

/**
 * @author liubi
 **/
public abstract class TemplateOperation {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod()
    {
        primitiveOperation1();
        primitiveOperation2();
    }
}
