public class ObserverImpl1  implements  Observer{
    @Override
    public void update(Observable o) {
        int nouvelEtat=((ObservableImp1)o).getEtat();
        System.out.println("Observer 1 a reçu la nouvelle valeur de état:"+nouvelEtat);

    }
}
