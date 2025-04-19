package ELevator_System;

public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    InternalButton internalButtons;
    ElevatorState elevatorState;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    //Constructor
    public ElevatorCar()
    {
        display=new ElevatorDisplay();
        internalButtons=new InternalButton();
        elevatorState=ElevatorState.IDLE;
        currentFloor=0;
        elevatorDirection=Direction.UP;
        elevatorDoor=new ElevatorDoor();
    }
    public void showDisplay()//Doubt same func kaise?
    {
        display.showDisplay();
    }
    public void pressButton(int destination)
    {
        internalButtons.pressButton(destination,this);
    }
    public void setDisplay()
    {
        this.display.setDisplay(currentFloor,elevatorDirection);
    }

    boolean moveElevator(Direction dir,int destinationFloor)
    {
        int start=currentFloor;
        if(dir==Direction.UP)
        {
            for(int i=start;i<=destinationFloor;i++)
            {
                this.currentFloor=start;
                setDisplay();
                showDisplay();
                if(i==destinationFloor)
                {
                    return true;
                }
            }
        }
        if(dir==Direction.DOWN)
        {
            for(int i=start;i>=destinationFloor;i--)
            {
                this.currentFloor=start;
                setDisplay();
                showDisplay();
                if(i==destinationFloor)
                {
                    return true;
                }
            }
        }
        return false;
    }


}
