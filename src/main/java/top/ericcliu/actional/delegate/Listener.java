package top.ericcliu.actional.delegate;

import java.util.Date;

/**
 * @author liubi
 * @date 03/12/2019 14:22
 */
public class Listener {
    public Listener() {
        System.out.println("Listener Constructing");
    }

    public void action(Date date) {
        System.out.println(this.getClass().getName() + " action: " + date.toString());
    }
}
