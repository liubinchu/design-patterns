package top.ericcliu.actional.strategy;

/**
 * @author liubi
 **/
public class ConcreteStrategy1 implements Strategy{

    // 不同的策略 有不同的行为
    @Override
    public void operate(Object... args) {
        StringBuilder sb = new StringBuilder();
        for (Object arg : args){
            sb.append(arg.toString());
        }
        System.out.println(sb.toString());
    }
}
