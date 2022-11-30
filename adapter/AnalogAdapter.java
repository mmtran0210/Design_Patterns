package adapter;

public class AnalogAdapter implements AnalogAlbum {
    
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }

    
    /** 
     * @return String
     */
    public String play(){
        return album.playSong(0);
    }

    
    /** 
     * @return String
     */
    public String rewind(){
        return album.prevSong();
    }

    
    /** 
     * @return String
     */
    public String ffwd(){
        return album.nextSong();
    }

    
    /** 
     * @return String
     */
    public String pause(){
        return "Pausing";
    }

    
    /** 
     * @return String
     */
    public String stopEject(){
        return "Stop cassette and ejecting";
    }
}
