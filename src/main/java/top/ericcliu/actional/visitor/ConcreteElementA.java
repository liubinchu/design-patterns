package top.ericcliu.actional.visitor;

import java.util.ArrayList;

/**
 * @author liubi
 **/
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitConcreteElementA(this);
    }

}
