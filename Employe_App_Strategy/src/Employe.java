public class Employe {

   protected  IEmploye employe;


    public float calculerIGR(){
      return employe.calculerIGR();

    }
    public float getSalaireNetMensuel(){
        return  employe.getSalaireNetMensuel();
    }

 public void setEmploye(IEmploye employe){
        this.employe=employe;
 }

 public void setSalaireBrutMensuel(float salaireBrutMensuel) {
             employe.setSalaireBrutMensuel(salaireBrutMensuel);
    }


    public void setCin(String cin){
        employe.setCin(cin);
    }
}
