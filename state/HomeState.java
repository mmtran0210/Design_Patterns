package state;

public class HomeState implements State {
    private TV tv;
    


    public HomeState(TV tv){
       this.tv = tv;
    }

    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "TV already on the home screen ";
    }
    
    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "Loading Netflix";
    }


    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "Loading Hulu";
    }

    public String pressMovieButton(){
        tv.setState(tv.getHomeState());
        return "";
    }

    public String pressTVButton(){
        tv.setState(tv.getHomeState());
        return "";
    }
}
