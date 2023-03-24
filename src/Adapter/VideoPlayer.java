package Adapter;

public class VideoPlayer implements Player{
    @Override
    public void Play(String message) {
        System.out.println("mp4 Player is Running with : "+message+" Path");
    }
}
