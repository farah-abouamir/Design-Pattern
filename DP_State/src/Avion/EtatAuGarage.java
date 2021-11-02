package Avion;
import Avion.AvionImpl;

public class EtatAuGarage extends State {
    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }
    @Override
    void executeSortirGarage() {
        System.out.println("Garage=>Piste");
        avion.state=new EtatEnPiste(avion);
    }
    @Override
    void executeEntrerGarage() {
        System.out.println("Impossible! Deja au garage");
    }
    @Override
    void executeDecoller() {
        System.out.println("Impossible! Deja au garage");
    }
    @Override
    void executeAtterir() {
        System.out.println("Impossible deja au garage");
    }
    @Override
    void executeDoActivity() {
        for(int i=0; i<10; i++)
            System.out.println("Activité de l'état au garage" +i);
    }
}
