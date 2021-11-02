package Avion;

import Avion.AvionImpl;

public abstract class State{
    protected AvionImpl avion;
    public State(AvionImpl avion){
        this.avion=avion;
    }
    abstract void executeSortirGarage();
    abstract void executeEntrerGarage();
    abstract void executeDecoller();
    abstract  void executeAtterir();
    abstract void executeDoActivity();
}
