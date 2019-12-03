package top.ericcliu.structural.bridge;

class Client{
    public static void main(String[] args) {
        Abstract ab = new RefinedAbstract();

        ab.setImplementor(new ConcreteImplA());
        ab.Operation();

        ab.setImplementor(new ConcreteImplB());
        ab.Operation();
    }
}