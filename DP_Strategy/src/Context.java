public class Context {

    private IStrategy strategy;
    public void appliquerStrategy(){
        strategy.appliquer();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
