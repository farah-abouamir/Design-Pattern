public class Proxy implements  Abstraction{
    private  Implementation implementation;
    @Override
    public void operation() {
        System.out.println("Verification des conditionq d acces pour le proxy");
        implementation= new Implementation();
        implementation.operation();
    }
}
