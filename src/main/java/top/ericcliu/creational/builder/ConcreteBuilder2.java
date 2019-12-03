package top.ericcliu.creational.builder;

/**
 * @author liubi
 **/
class ConcreteBuilder2 implements Builder
{
    private Product product = new Product();
    @Override
    public void BuilderA() {
        // TODO Auto-generated method stub
        product.a = "功能6";
    }

    @Override
    public void BuilderB() {
        // TODO Auto-generated method stub
        product.b = "功能7";
    }

    @Override
    public void BuilderC() {
        // TODO Auto-generated method stub
        product.c = "功能8";
    }

    @Override
    public Product getProduct() {
        // TODO Auto-generated method stub
        return product;
    }
}
