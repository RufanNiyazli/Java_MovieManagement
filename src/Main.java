import Film.Movie;
import Film.MovieManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MovieManager movieManager = new MovieManager();
        boolean flag = true;
        System.out.println("Welcome, Sir.");

        while (flag) {
            System.out.println("Add Movie-->1 : Find Movie-->2 : Exit --->3");
            int btn = scanner.nextInt();
            if (btn == 1) {
                System.out.print("Enter movie id:");
                int id = scanner.nextInt();
                System.out.print("Enter name of the movie: ");
                String movieName = scanner.nextLine();
                System.out.print("Enter movie's director: ");
                String director = scanner.nextLine();
                System.out.print("Enter movie's rating");
                double rating = scanner.nextDouble();

                Movie newMovie = new Movie(id, movieName, director, rating);
                movieManager.movieAdd(newMovie);


            }
        }
    }
}