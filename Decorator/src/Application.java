public class Application {

    public static void main(String[] args) {
        Boisson b1= new Expresso();
        System.out.println(b1.getDescription()+ "$"+ b1.cout());
        b1=new Caramel(b1);
        b1=new Chocolat(b1);
        System.out.println(b1.getDescription()+ "$"+ b1.cout());



    }
}
