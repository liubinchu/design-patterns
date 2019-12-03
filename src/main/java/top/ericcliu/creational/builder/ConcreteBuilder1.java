package top.ericcliu.creational.builder;

/**
 * @author liubi
 **/
class ConcreteBuilder1 implements Builder
{
    private Product product = new Product();
    @Override
    public void BuilderA()
    {
        product.a = "功能3";
    }

    @Override
    public void BuilderB() {
        // TODO Auto-generated method stub
        product.b = "功能4";
    }

    @Override
    public void BuilderC() {
        // TODO Auto-generated method stub
        product.c = "功能5";
    }

    @Override
    public Product getProduct() {
        // TODO Auto-generated method stub
        return product;
    }
}

