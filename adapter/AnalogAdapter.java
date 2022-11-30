package adapter;

public class AnalogAdapter implements AnalogAlbum {
    
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }

    public String play(){
        return album.playSong(0);
    }

    public String rewind(){
        return album.prevSong();
    }

    public String ffwd(){
        return album.nextSong();
    }

    public String pause(){
        return "Pausing";
    }

    public String stopEject(){
        return "Stop cassette and ejecting";
    }
}
