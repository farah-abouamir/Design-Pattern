package Video;

public class VideoEnLecture extends State{

    public VideoEnLecture(VideoImp videoImp) {
        super(videoImp);
    }

    @Override
    void ExecuteLireVideo() {
        System.out.println("La video deja en Lecture");
    }

    @Override
    void ExecuteArreterVideo() {
        System.out.println("Pause");
        videoImp.state= new VideoEnPause(videoImp);
    }
}
