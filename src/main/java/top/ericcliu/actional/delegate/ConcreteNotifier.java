package top.ericcliu.actional.delegate;

/**
 * @author liubi
 * @date 03/12/2019 14:21
 */
public class ConcreteNotifier extends Notifier{
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        super.addListener(object, methodName, args);
        // 添加 ConcreteNotifier 的逻辑
    }
    @Override
    public void notifyX() {
        super.notifyX();
        // 添加 ConcreteNotifier 的逻辑
    }
}
