package adapter;
import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public String playFromBeginning(){
        return ".";
    }

    public String playSong(int num){
        return ".";
    }

    public String prevSong(){
        return ".";
    }

    public String nextSong(){
        return ".";
    }

    public String stop(){
        return ".";
    }

    public String pause(){
        return ".";
    }






}
