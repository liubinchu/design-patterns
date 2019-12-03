package top.ericcliu.structural.proxy.jdkProxy;

public class Client {
    public static void main(String[] args) {
        Subject target = new RealSubject();
        System.out.println(target.getClass());
        //输出目标对象信息
        Subject proxy = (Subject) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        //输出代理对象信息
        proxy.action();  //执行代理方法
    }
}