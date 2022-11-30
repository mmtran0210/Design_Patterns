package adapter;
import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    
    private ArrayList<String> songs = new ArrayList<>();
    
    private static int currentIndex;
    
    public Cassett(ArrayList<String> songs){
        this.songs = songs;
    }
    
    
    /** 
     * @return String : Play song based on current index
     */
    public String play(){
        return "Playing song "+ (currentIndex+1) +": "+ songs.get(currentIndex++);
    }

    
    /** 
     * @return String : rewind song back to previous index
     */
    public String rewind(){
        if(currentIndex != 0){
            return "Rewinding to song " + (currentIndex--);
        }
        else
            return "Fully rewind";
       
        
    }

    
    /** 
     * @return String : forward one song
     */
    public String ffwd(){
        if(currentIndex != 4){
            return "Forward to song "+ (currentIndex++);
        }
        else if(currentIndex == 4){
            return "Forwarded to the end of the cassette";
        }   
            return "At the end of the cassette you need to rewind";

    }

    
    /** 
     * @return String : pause
     */
    public String pause(){
        return "Pausing";
    }

    /** 
     * @return String : stop
    */

    public String stopEject(){
        return "Stop cassette and ejecting";
    }
}

