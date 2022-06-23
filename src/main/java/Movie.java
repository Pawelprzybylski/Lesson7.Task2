public class Movie {
    String title;
    String directorName;
    int durationInMinutes;
    int releaseYear ;

    public Movie(String title, String directorName, int durationInMinutes, int releaseYear) {
        this.title = title;
        this.directorName = directorName;
        this.durationInMinutes = durationInMinutes;
        this.releaseYear  = releaseYear;
    }
}
