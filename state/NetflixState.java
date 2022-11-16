package state;

public class NetflixState implements State {
    private TV tv;

    private String[] movies = {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};

    private String[] tvShows = {"Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtle"};

    public NetflixState(TV tv){
        this.tv = tv;
    }
    
    
    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
    }
    
    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
    }


    public String pressHuluButton(){
        System.out.println("Loading Hulu");
        tv.setState(tv.getHuluState());
    }

    public String pressMovieButton(){
        for(int i=0; i< movies.length; i++){
            System.out.print("Netflix Movies: ");
            System.out.println((i+1)+". "+movies[i]);
            
    }
    }

    public String pressTVButton(){
        for(int i=0; i< tvShows.length; i++){
            System.out.print("Netflix TV shows: ");
            System.out.println((i+1)+". "+tvShows[i]);
            ;
    }
}
}
