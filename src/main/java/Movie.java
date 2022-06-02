public class Movie {
    String title;
    String directorName;
    int durationInMinutes;
    int releaseYear ;

    public Movie(String title, String nameAndSurnameDirector, int movieTimeInMinutes, int movieYear) {
        this.title = title;
        this.directorName = nameAndSurnameDirector;
        this.durationInMinutes = movieTimeInMinutes;
        this.releaseYear  = movieYear;
    }
}
