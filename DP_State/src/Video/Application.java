package Video;

public class Application {
    public static void main(String[] args) {

        IVideo video= new VideoImp();
        video.LireVideo();
        System.out.println("---------------------------------");
        video.ArreterVideo();
    }
}
