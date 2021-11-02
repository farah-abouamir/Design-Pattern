package Video;

public abstract class State {

    protected  VideoImp videoImp;

    public State(VideoImp videoImp) {
        this.videoImp = videoImp;
    }

    abstract void ExecuteLireVideo();
    abstract void ExecuteArreterVideo();
}
