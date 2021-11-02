package Avion;

import Avion.AvionImpl;

public class  EtatEnAir extends State {
    public EtatEnAir(AvionImpl avion) {
        super(avion);
    }
    @Override
    void executeSortirGarage() {
        System.out.println("Impossible! je suis en l'air");
    }
    @Override
    void executeEntrerGarage() {
        System.out.println("Impossible! je suis en l'air");
    }
    @Override
    void executeDecoller() {
        System.out.println("Impossible! je suis en l'air");
    }
    @Override
    void executeAtterir() {
        System.out.println(" l'air=>piste");
        avion.state= new EtatEnPiste(avion);
    }
    @Override
    void executeDoActivity() {
        for(int i=0; i<10; i++)
            System.out.println("Activité de l'état en l'air" +i);
    }
}