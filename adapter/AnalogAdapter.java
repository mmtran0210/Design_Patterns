package adapter;

public class AnalogAdapter implements AnalogAlbum {
    
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album){

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
