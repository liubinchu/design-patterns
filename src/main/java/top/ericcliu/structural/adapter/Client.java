package top.ericcliu.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request("arg");
    }
}