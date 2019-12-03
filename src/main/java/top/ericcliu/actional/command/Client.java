package top.ericcliu.actional.command;

/**
 * @author liubi
 **/
public class Client {
    public static void main(String[] args)
    {
        Action[] actions1 = new Action[]{new ActionA(), new ActionB()};
        Action[] actions2 = new Action[]{new ActionB(), new ActionA()};
        Command command1 = new Command1(actions1);
        Command command2 = new Command2(actions2);
        Invoker invoker = new Invoker();
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.deleteCommand(command1);
        invoker.executeCommand();
    }

}
