package Film;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {

    private List<Movie> movies;

    public MovieManager() {
        movies = new ArrayList<>();

    }

    public void movieAdd(Movie movie) {
        movies.add(movie);
        System.out.println(movie.getMovieName() + " Succesfully added.");


    }

    public List<Movie> searchMovie(String searchMovie) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if ((movie.getMovieName().toLowerCase().contains(searchMovie.toLowerCase())) ||
                    (movie.getDirectorName().toLowerCase().contains(searchMovie.toLowerCase())) ||
                    (movie.getGenre().toLowerCase().contains(searchMovie.toLowerCase()))) {


                results.add(movie);
            }


        }
        return results;

    }

    public void deleteMovie(String deleteMovie) {
        movies.removeIf(movie -> movie.getMovieName().toLowerCase().equals(deleteMovie.toLowerCase()));
        movies.removeIf(movie -> String.valueOf(movie.getMovieId()).equals(deleteMovie));
        System.out.println("Movie deleted succesfully");
    }


}
