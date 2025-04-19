package ELevator_System;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer>upMinPq;
    PriorityQueue<Integer>downMaxPq;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar)
    {
        this.elevatorCar=elevatorCar;
        upMinPq=new PriorityQueue<>();
        downMaxPq=new PriorityQueue<>((a,b)->b-a); //Max Priority Queue
    }

    public void submitInternalRequest(int floor,Direction direction)
    {
        if(direction==Direction.DOWN)
        {
            downMaxPq.offer(floor);
        }
        else {
            upMinPq.offer(floor);
        }
    }
    public void submitInternalRequest(int floor)
    {

    }
    public void controlElevator()
    {
        while(true)
        {
            if(elevatorCar.elevatorDirection==Direction.UP)
            {
                //ABC
            }
        }
    }
}
