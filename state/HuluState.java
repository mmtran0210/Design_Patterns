package state;

public class HuluState implements State {
    private TV tv;
    
    private String[] movies = {"Cars", "Cinderalla","Wall-E","ET"};

    private String[] tvShows = {"sesama street", "care bears", "loney tunes"};

    public HuluState(TV tv){
        this.tv = tv;
    }

    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "";
    }
    
    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "Loading Netflix";
    }


    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "";
    }

    public String pressMovieButton(){
        return ""+movies;
    }

    public String pressTVButton(){
        return ""+tvShows;
}
}
