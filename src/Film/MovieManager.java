package Film;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {

    private List<Movie> movies;

    public MovieManager(){
        movies = new ArrayList<>();

    }
    public void movieAdd(Movie movie){
        movies.add(movie);

    }

}
