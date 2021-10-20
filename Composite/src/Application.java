import sun.font.Decoration;

public class Application {
    public static void main(String[] args) {

        Folder root=new Folder("Design Patterns");
        Folder d1=(Folder) root.addComponent(new Folder("Comportement"));
        Folder d2=(Folder) root.addComponent(new Folder("Strucutre"));
        Folder d3=(Folder) root.addComponent(new Folder("Création"));
        d1.addComponent(new File("Strategy"));
        d1.addComponent(new File("Observer"));
        d2.addComponent(new File("Decorator"));
        root.show();
    }
}
