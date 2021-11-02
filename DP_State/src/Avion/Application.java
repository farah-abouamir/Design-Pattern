package Avion;

public class Application {

    public static void main(String[] args) {


        IAvion avion=new AvionImpl();
        avion.doActivity();
        System.out.println("--------------------");
        avion.sortirGarage();
        avion.entrerGarage();
        avion.decoller();
        avion.doActivity();

    }
}
