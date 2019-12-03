package top.ericcliu.actional.delegate;

/**
 * @author liubi
 * @date 03/12/2019 14:21
 */
public class ConcreteNotifier extends Notifier{

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
