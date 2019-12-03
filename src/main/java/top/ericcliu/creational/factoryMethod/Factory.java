package top.ericcliu.creational.factoryMethod;

import top.ericcliu.creational.simpleFactory.Product;

/**
 * @author liubi
 **/
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
    }
}
