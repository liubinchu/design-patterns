package top.ericcliu.structural.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        //目标对象
        Subject target = new RealSubject();
        //代理对象
        Proxy proxy = new Proxy(target);
        proxy.action();
    }
}