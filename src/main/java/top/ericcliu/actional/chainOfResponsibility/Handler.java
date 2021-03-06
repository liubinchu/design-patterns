package top.ericcliu.actional.chainOfResponsibility;

/**
 * @author liubi
 **/
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
