package Practice.Practice22;
public class Movie {
    String title, director;
    double rating;

    Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    void showMovieDetails() {
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}
