public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    public static Movie[] getPG(Movie[] movies) {
        if (movies == null || movies.length == 0) {
            return new Movie[0];
        }

        int pgCount = 0;
        for (Movie movie : movies) {
            if (movie.getRating().equalsIgnoreCase("PG")) {
                pgCount++;
            }
        }

        Movie[] pgMovies = new Movie[pgCount];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.getRating().equalsIgnoreCase("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }
        return pgMovies;
    }
}