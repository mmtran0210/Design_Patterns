package adapter;
import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    
    private ArrayList<String> songs = new ArrayList<>();
    
    private static int currentIndex;
    
    public Cassett(ArrayList<String> songs){
        this.songs = songs;
    }
    
    public String play(){
        return "Playing song "+ (currentIndex+1) +": "+ songs.get(currentIndex++);
    }

    public String rewind(){
        return "Rewinding to song " + (currentIndex--);
        
    }

    public String ffwd(){
        return "Forward to song "+ (currentIndex++);
    }

    public String pause(){
        return "Pausing";
    }

    public String stopEject(){
        return "Stop cassette and ejecting";
    }
}
