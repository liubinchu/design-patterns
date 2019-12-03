package top.ericcliu.creational.builder;

/**
 * @author liubi
 **/
public class Director {
    public void Construct (Builder builder)
    {
        builder.BuilderA();
        builder.BuilderB();
        builder.BuilderC();
    }
}
