package state;

public class HomeState implements State {
    private TV tv;
    


    public HomeState(TV tv){
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
        System.out.println("Loading Hulu");
        tv.setState(tv.getHuluState());
    }

    public String pressMovieButton(){
        tv.setState(tv.getHomeState());
    }

    public String pressTVButton(){
        tv.setState(tv.getHomeState());
    }
}
