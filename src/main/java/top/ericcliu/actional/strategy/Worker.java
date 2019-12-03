package top.ericcliu.actional.strategy;

/**
 * @author liubi
 **/
public abstract class Worker {
    private Strategy strategy = null;

    public Worker(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void work(Object... args){
        strategy.operate(args);
    }
}
