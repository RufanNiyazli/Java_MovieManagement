import Film.Movie;
import Film.MovieManager;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        MovieManager movieManager = new MovieManager();
        boolean flag = true;
        System.out.println("Welcome, Sir.");

        while (flag) {
            System.out.println("Add Movie-->1 : Search Movie-->2 : Delete movie-->3 : Exit --->4");
            int btn = scanner.nextInt();
            switch (btn) {
                case 1:
                    int id = Math.abs(UUID.randomUUID().hashCode()) % 100;
                    System.out.println("Movie id will be : " + id);
                    scanner.nextLine();
                    System.out.print("Enter name of the movie: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter movie's director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter movie's genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter movie's rating: ");
                    double rating = scanner.nextDouble();

                    Movie newMovie = new Movie(id, movieName, director, genre, rating);
                    movieManager.movieAdd(newMovie);

                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter the movie's name or director of the movie which you want find. ");
                    String searchMovie = scanner.nextLine();

                    List<Movie> results = movieManager.searchMovie(searchMovie);
                    if (results.isEmpty()) {
                        System.out.println("Movie is not find!");
                    } else {
                        for (Movie result : results) {
                            System.out.println(result.getMovieName() + " " + result.getDirectorName() + " " + result.getGenre() + " " + result.getRating());
                        }
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter movie name that you want delete: ");
                    String deleteMovie = scanner.nextLine();
                    movieManager.deleteMovie(deleteMovie);



                    break;
                case 4:
                    flag = false;

                    System.out.println("Goodbbye...");
                    scanner.close();
                    break;
            }


        }
    }
}