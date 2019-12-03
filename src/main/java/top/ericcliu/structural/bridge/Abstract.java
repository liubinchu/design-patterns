package top.ericcliu.structural.bridge;

//整个物体的抽象
public class Abstract
{
    public Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void Operation()
    {
        implementor.Operation();
    }
}