package top.ericcliu.actional.delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liubi
 * @date 03/12/2019 14:20
 */
public class EventHandler {

    private List<Event> objects;

    public EventHandler()
    {
        objects = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object...args)
    {
        objects.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception
    {
        for (Event event : objects)
        {
            event.invoke();
        }
    }
}
