package top.ericcliu.actional.delegate;

/**
 * @author liubi
 * @date 03/12/2019 14:21
 */
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler()
    {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler)
    {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName, Object...args);

    public abstract void notifyX();

}
