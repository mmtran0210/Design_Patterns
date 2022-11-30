package adapter;
import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    
    ArrayList<String> songs = new ArrayList<>();
    
    private int currentIndex;
    
    public Cassett(ArrayList<String> songs){
        
    }
    
    public String play(){
        return ".";
    }

    public String rewind(){
        return ".";
    }

    public String ffwd(){
        return ".";
    }

    public String pause(){
        return ".";
    }

    public String stopEject(){
        return ".";
    }
}
