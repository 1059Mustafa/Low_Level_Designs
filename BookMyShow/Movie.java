package BookMyShow;

public class Movie {

    int movieId;
    String movieName;
    int movieDurationINMinutes;

    //Other details like genre,Language etc
    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName()
    {
        return movieName;
    }
    public void setMovieName(String movieName)
    {
        this.movieName=movieName;
    }
    public void setMovieDurationINMinutes(int movieDuration)
    {
        this.movieDurationINMinutes=movieDuration;
    }

    public int getMovieDurationINMinutes() {
        return movieDurationINMinutes;
    }
}
