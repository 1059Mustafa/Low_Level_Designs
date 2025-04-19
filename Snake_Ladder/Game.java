package Snake_Ladder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class Game {

    Board board;
    Dice dice;
    Deque<Player>playerList=new LinkedList<>();
    Player winner;

    public Game()
    {
        initiazeGame();
    }
    private void initiazeGame()
    {
        board=new Board(10,5,4);
        dice = new Dice(1);
        winner=null;
        addPlayers();
    }
    private void addPlayers()
    {
        Player player1=new Player("p1",0); //Player_id, currentPos
        Player player2=new Player("p2",0);
        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame()
    {
        while(winner==null)
        {
            //Check whose turn is now
            Player playerTurn=findPlayerTurn();
            System.out.println("Player turn is: "+ playerTurn.id+" current position is: "+ playerTurn.currentPosition);

            //Now roll Dice
            int diceNumbers=dice.rollDice();

            //Get the new Position
            int playerNewPosition=playerTurn.currentPosition+diceNumbers;
            playerNewPosition=jumpCheck(playerNewPosition);
            playerTurn.currentPosition=playerNewPosition;

            System.out.println("Player turn is: "+playerTurn.id+"new position is: "+playerNewPosition);
            //Check for winning condition
            if(playerNewPosition>=board.cells.length*(board.cells.length-1))
            {
                winner=playerTurn;
            }
        }
        System.out.println("Winner is :"+winner.id);
    }//End start game

    private Player findPlayerTurn()
    {
        Player playerTurns=playerList.removeFirst();
        playerList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck(int playerNewPosition)
    {
        if(playerNewPosition>(board.cells.length*board.cells.length-1))
        {
            return playerNewPosition;
        }
        Cell c=board.getCell(playerNewPosition);
        if(c.jump!=null&&c.jump.start==playerNewPosition)
        {
            String jumpBy=(c.jump.start<c.jump.end)?"ladder":"snake";
            System.out.println("Jump Done by: "+jumpBy);
            return c.jump.end;
        }
        return playerNewPosition;
    }
}
