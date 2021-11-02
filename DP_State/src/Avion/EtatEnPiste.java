package Avion;

import Avion.AvionImpl;
import Avion.EtatAuGarage;
import Avion.EtatEnAir;

public class EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }
    @Override
    void executeSortirGarage() {
        System.out.println("je suis déja en piste !!!");
    }
    @Override
    void executeEntrerGarage() {
        System.out.println("piste=>Garage");
        avion.state=new EtatAuGarage(avion);
    }
    @Override
    void executeDecoller() {
        System.out.println("piste=>Decollage");
        avion.state=new EtatEnAir(avion);
    }
    @Override
    void executeAtterir() {
        System.out.println("impossible!Deja en piste");
    }
    @Override
    void executeDoActivity() {
        for(int i=0; i<10; i++)
            System.out.println("Activité de l'état en piste" +i);

    }
}