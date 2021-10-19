public class App {
    public static void main(String[] args) {
// Création du sujet
        ObservableImp1 observable=new ObservableImp1();
// Création des observateurs
        ObserverImpl1 o1=new ObserverImpl1(); ObserverImpl2 o2=new ObserverImpl2();
// Changer l'état du sujet
        System.out.println("---- Changement d'atat -----");
        observable.setEtat(70);
// Enregistrer les observateur
        observable.addObserver(o1); observable.addObserver(o2);
// Changer l'état du sujet
        System.out.println("---- Changement d'atat -----");
        observable.setEtat(90);
// Supprimer un observateur
        observable.removeObserver(o1);
//Changer l'état du sujet
        System.out.println("---- Changement d'atat -----");
        observable.setEtat(23);
    }
}
