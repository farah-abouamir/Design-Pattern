public class Caramel extends  Decorateur{


    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.30+ boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ ", Caramel";
    }
}
