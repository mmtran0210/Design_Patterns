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
        return "Already on Hulu";
    }

    public String pressMovieButton(){
        tv.setState(tv.getHuluState());
        return "Hulu Movies: \n1. Cars\n2. Cinderella\n3. Wall-E\n4. ET";
    }

    public String pressTVButton(){
        tv.setState(tv.getHuluState());
        return "Hulu Shows: \n1. sesama street\n2. care bears\n3. lone tune";
}
}
