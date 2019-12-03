package top.ericcliu.actional.delegate;

import java.util.Date;

/**
 * @author liubi
 * @date 03/12/2019 14:23
 */
public class Client {
    public static void main(String[] args) {

        Notifier notifier = new ConcreteNotifier();

        Listener listener = new Listener();

        notifier.addListener(listener, "action", new Date());

        notifier.notifyX();
    }
}
