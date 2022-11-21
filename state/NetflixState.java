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
        return "Loading the Home Screen";
    }
    
    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "You already on the Netflix screen";
    }


    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "Loading Hulu";
    }

    public String pressMovieButton(){

            return ": "+movies;
       }
        



    public String pressTVButton(){
        return ""+tvShows;
    }
}


