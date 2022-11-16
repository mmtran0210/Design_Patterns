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
    }
    
    public String pressNetflixButton(){
        System.out.println("Loading Netflix");
        tv.setState(tv.getNetflixState());
    }


    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
    }

    public String pressMovieButton(){
        for(int i=0; i< movies.length; i++){
            System.out.print("Hulu Movies: ");
            System.out.println((i+1)+". "+movies[i]);
        }
        return;
    }

    public String pressTVButton(){
        for(int i=0; i< tvShows.length; i++){
            System.out.print("Hulu Movies: ");
            System.out.println((i+1)+". "+tvShows[i]);
        }
        return
}
}
