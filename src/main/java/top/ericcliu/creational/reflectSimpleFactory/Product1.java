package top.ericcliu.creational.reflectSimpleFactory;

/**
 * @author liubi
 **/
class Product1 implements AbstractProduct {
    @Override
    public void eat(){
        System.out.println("Product1");
    }
}
