package top.ericcliu.structural.adapter;

public class Adaptee {
    // 需要适配的类
    public void specficRequest(String arg){
        System.out.println(this.getClass().getName()+arg);
    }
}