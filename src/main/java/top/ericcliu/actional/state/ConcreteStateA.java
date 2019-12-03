package top.ericcliu.actional.state;

/**
 * @author liubi
 **/
public class ConcreteStateA implements State{
    @Override
    public void handler(Worker worker) {
        // TODO Auto-generated method stub
        // 状态转换
        // 无条件转换，可以添加转换条件
        System.out.print("from state "+worker.currentState.toString());
        worker.currentState = new ConcreteStateB();
        System.out.println("change to state "+worker.currentState.toString());
    }
}
