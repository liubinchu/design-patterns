package top.ericcliu.structural.proxy.jdkProxy;

public class RealSubject implements Subject {
    @Override
    public void action() {
        System.out.println(this.getClass().getName()+"action");
    }
}