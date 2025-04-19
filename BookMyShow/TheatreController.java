package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre>allTheatre;

    TheatreController()
    {
        cityVsTheatre=new HashMap<>();
        allTheatre=new ArrayList<>();
    }

    // Understand the below code
    void addTheatre(Theatre theatre,City city)
    {
        allTheatre.add(theatre);
        List<Theatre>theatres=cityVsTheatre.getOrDefault(city,new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city,theatres);
    }

    Map<Theatre,List<Show>>getAllShow(Movie movie,City city)
    {
        //get ll the theater of this movie

        Map<Theatre,List<Show>>ttheatreVsShows=new HashMap<>();
        List<Theatre>theatres=cityVsTheatre.get(city);
        //Filter the theatres which run this movie
        for(Theatre theatre:theatres)
        {
            List<Show>givenMovieShows=new ArrayList<>();
            List<Show>shows=theatre.getShow();
            for(Show show:shows)
            {
                if(show.movie.getMovieId()== movie.getMovieId())
                {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty())
            {
                ttheatreVsShows.put(theatre,givenMovieShows);
            }
        }
        return ttheatreVsShows;
    }
}
