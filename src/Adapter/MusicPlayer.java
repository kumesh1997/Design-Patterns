package Adapter;

public class MusicPlayer implements Player{
    @Override
    public void Play(String message) {
        System.out.println("mp3 Player is Running with : "+message+" Path");
    }
}
