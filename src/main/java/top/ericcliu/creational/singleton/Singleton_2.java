package top.ericcliu.creational.singleton;

/**
 * @author liubi
 **/
public class Singleton_2 {

    private Singleton_2() {
    }

    private static class Holder {
        private static final Singleton_2 singleton = new Singleton_2();
    }

    private static Singleton_2 getInstance() {
        return Holder.singleton;
    }

}
