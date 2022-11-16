package state;

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;


public TV(){}



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