package Tic_Tac_Toe;

public class Player {

    //Player name and type of player
    public String name;
    public PlayingPiece playingPiece;

    //Constructor
    public Player(String name,PlayingPiece playingPiece)
    {
        this.name=name;
        this.playingPiece=playingPiece;
    }

    //Setter and Getter Player name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    //Setter and getter of PlayingPiece
    public PlayingPiece getPlayingPiece()
    {
        return playingPiece;
    }
    public void setPlayingPiece(PlayingPiece playingPiece)
    {
        this.playingPiece=playingPiece;
    }
}
