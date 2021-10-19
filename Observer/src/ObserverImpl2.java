public class ObserverImpl2 implements  Observer{
    @Override
    public void update(Observable o) {
        int nouvelEtat=((ObservableImp1)o).getEtat();
        System.out.println("Observer 2 Mise à jour avec état:"+nouvelEtat);

    }
}
