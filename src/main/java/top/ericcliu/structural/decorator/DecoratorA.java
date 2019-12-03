package top.ericcliu.structural.decorator;

public class DecoratorA extends Decorator{
    @Override
    public void Operation()
    {
        super.Operation();
        // 自己的操作
        System.out.println(this.getClass().getName());
    }
}