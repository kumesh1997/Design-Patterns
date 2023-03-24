package Singleton;

public class ClipBoard {
    private String value;
    private static ClipBoard Instance;

//    Constructor
    private ClipBoard(){
    }

    public static ClipBoard GetInstance(){
        if (Instance == null){
            Instance = new ClipBoard();
        }
        return Instance;
    }

    public void Copy(String value){
        this.value = value;
    }
    public String Paste(){
        return value;
    }
}
