package BookMyShow;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovies;
    List<Movie>allMovies;

    MovieController()
    {
        cityVsMovies=new HashMap<>();
        allMovies=new ArrayList<>();
    }

    //Add movie to a particular city, make use of cityVsMovie map

    void addMovie(Movie movie, City city)
    {
        allMovies.add(movie);
        List<Movie>movies=cityVsMovies.getOrDefault(city,new ArrayList<>());//Samajh nahi aaya
        movies.add(movie);//Why
        cityVsMovies.put(city,movies);
    }
    public Movie getMovieByName(String movieName)
    {
        for(Movie movie:allMovies)
        {
            if(movie.getMovieName().equals(movieName))
            {
                return movie;
            }
        }
        return null;
    }
    List<Movie>getAllMoviesByCity(City city)
    {
        return cityVsMovies.get(city);
    }

    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list
}
