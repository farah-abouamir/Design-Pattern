public class EmployeImpAlger implements IEmploye{


    private String cin;
    private float salaireBrutMensuel;

    @Override
    public float calculerIGR() {
        float salaireBrutAnuel=salaireBrutMensuel*12;
        float taux=35;
        return salaireBrutAnuel*taux/100;
    }

    @Override
    public float getSalaireNetMensuel() {
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }

    @Override
    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    @Override
    public void setCin(String cin) {
        this.cin = cin;
    }
}
