package adapter;
import java.util.ArrayList;

public class CD implements DigitalAlbum {
    
    private ArrayList<String> songs;
    
    private static int currentIndex;

 
    public CD(ArrayList<String> songs){
        this.songs = songs;
    }

    public String playFromBeginning(){
        return "Playing song 1 " + songs.get(currentIndex);
    }

    public String playSong(int num){
        if(num<5){
            return "Playing song "+ (currentIndex+1) +": "+ songs.get(currentIndex++);
    }   else 
            return "Not a valid song number";
    }

    public String prevSong(){

        return "Skipping back and playing: " + songs.get(--currentIndex);
    }

    public String nextSong(){
        return "Playing " + (currentIndex+1) + ": " + songs.get(currentIndex++) ;
    }

    public String stop(){
        return "Stopping";
    }

    public String pause(){
        return "Pausing";
    }






}
