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
    return "";
}

public String pressHuluButton(){
    setState(HuluState);
    return "";
}

public String pressMovieButton(){
    setState(HomeState);
    return "";
}

public String pressTVButton(){
    setState(HomeState);
    return "";
}

public String pressNetflixButton(){
    setState(NetflixState);
    return "";
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
    this.state = state;
}
}