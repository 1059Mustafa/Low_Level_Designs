package BookMyShow;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;
    //Constructor
    BookMyShow()
    {
        movieController=new MovieController();
        theatreController=new TheatreController();
    }

    public static void main(String[] args)
    {
        BookMyShow bookMyShow=new BookMyShow();
        bookMyShow.initialize();

        //user1
        //bookMyShow.createBooking(City.Bangalore,"BAHUBALI");
        //user2
        //bookMyShow.createBooking(City.Bangalore,"BAHUBALI");
    }

    private void initialize()
    {
        //Create movies
        //createMovies();

        //create theater with screens,seats and show
        //createTheatre();
    }
}
