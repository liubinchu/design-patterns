package top.ericcliu.actional.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liubi
 **/
public class Invoker {
    private List<Command> commands = new LinkedList<>();
    //在add和delete方法中可以执行排队请求和记录日志和否决请求操作
    public void addCommand(Command command)
    {
        commands.add(command);
    }

    public void deleteCommand(Command command)
    {
        commands.remove(command);
    }

    public void executeCommand()
    {
        for (Command command : commands)
        {
            command.execute();
        }
    }
}
