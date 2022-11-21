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
        tv.setState(tv.getNetflixState());
            return "Netflix Movies: \n1. The Land Before Time\n2. Frozen\n3. The Little Mermaid\n4. Ice Age";
       }
        
    public String pressTVButton(){
        tv.setState(tv.getNetflixState());
        return "Netflix Shows: \n1. Peppa Pig\n2. My little Pony\n3. Garfield\n4. Teenage Mutant Ninja Turtle";

    }
}


