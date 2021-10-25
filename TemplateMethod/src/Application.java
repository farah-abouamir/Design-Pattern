public class Application {


    public static void main(String[] args) {
        TemplateClass t=new Implementation1();
        System.out.println(t.operationTemplate());
        t=new Implementation2();
        System.out.println(t.operationTemplate());
    }
}
