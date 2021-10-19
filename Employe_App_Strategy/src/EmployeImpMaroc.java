public class EmployeImpMaroc implements IEmploye{
    private String cin;
    private float salaireBrutMensuel;
    @Override
    public float calculerIGR() {;
        float taux=0;
        if(salaireBrutMensuel<40000)
             taux=5;
        if (salaireBrutMensuel>40000 && salaireBrutMensuel<120000)
            taux=42;

        float salaireBrutAnuel=salaireBrutMensuel*12;

        return salaireBrutAnuel*taux/100;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    @Override
    public float getSalaireNetMensuel() {
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }
}
