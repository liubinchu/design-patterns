package top.ericcliu.actional.command;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author liubi
 **/
public class Command1 extends Command {
    public Command1(Action[] actions) {
        super(actions);
    }

    @Override
    public void execute() {
        // 不同的命令 不同行为
        for(int i=0; i< this.actions.length;i++){
            this.actions[i].doAction();
        }
    }
}
