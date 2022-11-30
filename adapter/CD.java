package adapter;
import java.util.ArrayList;

public class CD implements DigitalAlbum {
    
    private ArrayList<String> songs;
    
    private static int currentIndex;

 
    public CD(ArrayList<String> songs){
        this.songs = songs;
    }

    
    /** 
     * @return String: play song from index 0 
     */
    public String playFromBeginning(){
        return "Playing song 1 " + songs.get(currentIndex);
    }

    
    /** 
     * @param num
     * @return String: play song based on current index
     */
    public String playSong(int num){
        if(num<5){
            return "Playing song "+ (currentIndex+1) +": "+ songs.get(currentIndex++);
    }   else 
            return "Not a valid song number";
    }

    
    /** 
     * @return String: rewind one song
     */
    public String prevSong(){

        return "Skipping back and playing: " + songs.get(--currentIndex);
    }

    
    /** 
     * @return String: play next song move to the next right index
     */
    public String nextSong(){
        return "Playing " + (currentIndex+1) + ": " + songs.get(currentIndex++) ;
    }

    
    /** 
     * @return String: stop
     */
    public String stop(){
        return "Stopping";
    }

    
    /** 
     * @return String: pause
     */
    public String pause(){
        return "Pausing";
    }






}
