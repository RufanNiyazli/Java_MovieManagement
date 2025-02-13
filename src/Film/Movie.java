package Film;

public class Movie {
    private int movieId;
    private String movieName;
    private String directorName;
    private double rating;

    public Movie(int movieId, String movieName, String directorName, double rating) {

        this.movieName = movieName;
        this.movieId = movieId;
        this.directorName = directorName;
        this.rating = rating;

    }

    public String toString() {
        return "Movie Name " + movieName + " Director Name " + directorName + " Rating " + rating;
    }
}
