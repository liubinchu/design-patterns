package top.ericcliu.structural.bridge;

//某个子物体
public class RefinedAbstract extends Abstract
{
    @Override
    public void Operation()
    {
        //可以添加特有的一些操作
        implementor.Operation();
    }
}