package Adapter;

public class AdapterMainClass {

    public static void runAdapter(){
        String path = "file.png";
        Player player = ExtensionFilter.Filter(path);
        player.Play(path);
    }
}
