package top.ericcliu.structural.proxy.staticProxy;

public class Proxy implements Subject{
    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void action() {
        realSubject.action();
    }
}