import java.util.ArrayList;
import java.util.List;

public class ObservableImp1 implements  Observable{
   private List<Observer> observerList=new ArrayList<>();
   private  int etat;

    @Override
    public void addObserver(Observer o) {
    observerList.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
            for(Observer o:observerList)
            {
                o.update(this);

            }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        notifyObservers();
    }
}
