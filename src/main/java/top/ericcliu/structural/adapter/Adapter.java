package top.ericcliu.structural.adapter;

public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request(String arg) {
        // 进行适配逻辑
        // from adaptee to target
        System.out.println("适配");
        adaptee.specficRequest(arg);
    }
}