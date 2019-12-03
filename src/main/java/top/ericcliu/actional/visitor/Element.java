package top.ericcliu.actional.visitor;

/**
 * @author liubi
 **/
public interface Element {
    void accept(Visitor visitor);
}
