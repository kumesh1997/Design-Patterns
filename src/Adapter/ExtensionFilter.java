package Adapter;

public class ExtensionFilter {
    public static Player Filter(String FilePath){

        String extension = FilePath.substring(FilePath.lastIndexOf(".")+1);
        Player player = null;

        if (extension.equals("mp4")){
            player = new VideoPlayer();
        }else if (extension.equals("mp3")){
            player = new MusicPlayer();
        } else if (extension.equals("jpg") || extension.equals("png")) {
            player = new ImagePlayer(new ImageView());
        } else {
            System.out.println("File type is not Matching");
            return null;
        }
        return player;
    }
}
