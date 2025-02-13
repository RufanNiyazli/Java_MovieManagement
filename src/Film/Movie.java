package Film;

public class Movie {
    private int movieId;
    private String movieName;
    private String directorName;
    private String genre;
    private double rating;

    public Movie(int movieId, String movieName, String directorName,String genre, double rating) {

        this.movieName = movieName;
        this.movieId = movieId;
        this.directorName = directorName;
        this.genre= genre;
        this.rating = rating;

    }

    public int getMovieId() {
        return movieId;
    }

    public double getRating() {
        return rating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Movie Name " + movieName + " Director Name " + directorName + " Rating " + rating;
    }
}
