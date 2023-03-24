package Adapter;

public class ImagePlayer implements Player {
    ImageView imageView= null;

    ImagePlayer(ImageView i){
        this.imageView = i;
    }
    @Override
    public void Play(String message) {
        imageView.ShowImage(message);
    }
}
