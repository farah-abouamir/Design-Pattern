public abstract class Component {

protected String name;
protected int level; // determine le niveau de la hierarchie

    public  abstract void show();

    public Component(String name) {
        this.name = name;
    }

    public  String tab(){
        String tab="" ;
        for (int i=0; i<level ; i++)
            tab+="\t";

          return tab;
    }
}
