package Video;



public class VideoImp implements  IVideo{
    protected State state;

    public VideoImp() {
        this.state = new VideoEnPause(this) ;
    }

    @Override
    public void LireVideo() {
       state.ExecuteLireVideo();
    }

    @Override
    public void ArreterVideo() {
           state.ExecuteArreterVideo();
    }
}
