package Avion;

public class AvionImpl implements IAvion {
    protected State state;

    public AvionImpl() {
        this.state = new EtatEnPiste(this) ;
    }

    @Override
    public void sortirGarage() {
        state.executeSortirGarage();

    }

    @Override
    public void entrerGarage() {
        state.executeEntrerGarage();

    }

    @Override
    public void decoller() {
      state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
         state.executeDoActivity();
    }








}
