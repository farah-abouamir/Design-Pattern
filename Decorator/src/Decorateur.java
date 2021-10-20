public abstract class  Decorateur  extends Boisson{

    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();


}
