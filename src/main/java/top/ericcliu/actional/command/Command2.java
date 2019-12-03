package top.ericcliu.actional.command;

/**
 * @author liubi
 **/
public class Command2 extends Command {

    public Command2(Action[] actions) {
        super(actions);
    }

    @Override
    public void execute() {
        // 不同的命令 不同行为
        for(int i=this.actions.length-1; i>=0 ;i--){
            this.actions[i].doAction();
        }
    }
}
