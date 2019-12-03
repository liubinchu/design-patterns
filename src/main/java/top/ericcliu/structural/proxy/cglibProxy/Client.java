package top.ericcliu.structural.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {
        Subject target = new Subject();
        System.out.println(target.getClass());
        //输出目标对象信息
        Subject proxy = (Subject) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        //输出代理对象信息
        proxy.action();  //执行代理方法
    }
}