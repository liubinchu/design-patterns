package top.ericcliu.structural.proxy.cglibProxy;

public class Subject   {
    public void action() {
        System.out.println(this.getClass().getName()+"action");
    }
}