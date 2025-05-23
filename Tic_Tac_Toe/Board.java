package Tic_Tac_Toe;

import kotlin.Pair;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][]board;
    //Declaring Board
    Board(int size)
    {
        this.size=size;
        board=new PlayingPiece[size][size];
    }

    //Abhi kya kar rhe hai us place pe X/O add kar rhe hai.
    public boolean addPiece(int r, int c, PlayingPiece playingPiece)
    {
        if(board[r][c]!=null)
        {
            return false;
        }
        board[r][c]=playingPiece;
        return true;
    }
    //Initializing Board
    public List<Pair<Integer,Integer>>getFreeCells()
    {
        List<Pair<Integer,Integer>> freeCells=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                {
                    Pair<Integer,Integer>rowColumn=new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
       return freeCells;
    }

    //Print Board
    public void printBoard()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]!=null)
                {
                    System.out.print(board[i][j].pieceType.name()+" ");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
