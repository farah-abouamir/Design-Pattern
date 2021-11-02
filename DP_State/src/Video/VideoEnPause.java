package Video;

public class VideoEnPause extends State {
    public VideoEnPause(VideoImp videoImp) {
        super(videoImp);
    }

    @Override
    void ExecuteLireVideo() {
        System.out.println("La video deja en Pause");
    }

    @Override
    void ExecuteArreterVideo() {
        System.out.println("Lecture");
        videoImp.state= new VideoEnLecture(videoImp);
    }
}
