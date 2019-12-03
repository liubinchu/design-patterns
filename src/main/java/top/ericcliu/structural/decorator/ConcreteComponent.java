package top.ericcliu.structural.decorator;

public class ConcreteComponent implements Component{
    @Override
    public void Operation() {
        System.out.println(this.getClass().getName());
    }
}