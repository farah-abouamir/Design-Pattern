public class App {

    public static void main(String[] args) {
     Employe employe=new Employe();
     employe.setEmploye(new EmployeImpMaroc());
     employe.setSalaireBrutMensuel(30000);
     System.out.println("salaire brut mensuel Maroc " + employe.calculerIGR());
     employe.setEmploye(new EmployeImpAlger());
     employe.setSalaireBrutMensuel(30000);
     System.out.println("salaire brut mensuel Algerie " + employe.calculerIGR());




    }
}
