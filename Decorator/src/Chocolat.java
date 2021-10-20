public class Chocolat extends  Decorateur{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0020+ boisson.cout();
    }


    @Override
    public String getDescription() {
        return boisson.getDescription()+", Chocolat";
    }
}
