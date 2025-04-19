package Snake_Ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    Board(int boardSize,int numberofSnake,int numberofLadders)
    {
        initializeCells(boardSize); // Initializing Board
        addSnakeLadder(cells,numberofSnake,numberofLadders); //Adding Snake and ladder
    }

    private void initializeCells(int boardSize)
    {
        cells=new Cell[boardSize][boardSize]; //Board initialise
        for(int i=0;i<boardSize;i++)
        {
            for(int j=0;j<boardSize;j++)
            {
                Cell cellObj=new Cell();  //Nahi samajh aaya
                cells[i][j]=cellObj;
            }
        }
    }

    private void addSnakeLadder(Cell[][] cell,int numberOfSnake,int numberOfLadder)
    {
        while(numberOfSnake>0)
        {
            int snakeHead = ThreadLocalRandom.current().nextInt(1,(cell.length*cell.length-10));
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cell.length*cell.length-1);

            if(snakeTail>=snakeHead)
            {
                continue;
            }

            Jump snakeObj=new Jump();
            snakeObj.start=snakeHead;
            snakeObj.end=snakeTail;

            Cell c=getCell(snakeHead); //---> ye kis liye
            c.jump=snakeObj;
            numberOfSnake--;
        }

        while(numberOfLadder>0)
        {
            int ladderStart=ThreadLocalRandom.current().nextInt(1, cell.length* cell.length-1);
            int ladderend=ThreadLocalRandom.current().nextInt(1, cell.length* cell.length-1);

            if(ladderStart>=ladderend)
            {
                continue;
            }
            Jump laddeObj=new Jump();
            laddeObj.start=ladderStart;
            laddeObj.end=ladderend;
            Cell c=getCell(ladderStart);
            c.jump=laddeObj;
            numberOfLadder--;
        }
    }

    Cell getCell(int playerPosition)
    {
        int boardRow=playerPosition/ cells.length;
        int boardColoumn=(playerPosition% cells.length);
        return cells[boardRow][boardColoumn];
    }
}
