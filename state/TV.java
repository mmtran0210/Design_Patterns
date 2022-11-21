package state;

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;


public TV(){
    setState(HomeState);
}

public String pressHomeButton(){
    setState(HomeState);
    return "Already at Home Screen";
}

public String pressHuluButton(){
    setState(getHuluState());
    return "Loading Hulu ";
}

public String pressMovieButton(){
    setState(getHomeState());
    return "TV is already at on Home Screen";
}

public String pressTVButton(){
    setState(getHomeState());
    return "Tv is already at on Home Screen";
}

public String pressNetflixButton(){
    setState(getNetflixState());
    return "Loading Netflix";
}

public State getNetflixState(){
    return NetflixState;
}

public State getHomeState(){
    return HomeState;
}

public State getHuluState(){
    return HuluState;
}

public void setState(State state){
    state = this.state;
}
}