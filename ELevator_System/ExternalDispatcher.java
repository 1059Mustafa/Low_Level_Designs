package ELevator_System;
import java.util.List;
public class ExternalDispatcher {
    List<ElevatorController>elevatorControllerList=ElevatorCreator.elevatorControllerList;

    public void submitExternalRequest(int floor,Direction direction)
    {
        //for simplicity i am following even odd
        for(ElevatorController elevatorController:elevatorControllerList)
        {
            int elevatorId=elevatorController.elevatorCar.id;
            if(elevatorId%2==1&&floor%2==1)
            {
                elevatorController.submitInternalRequest(floor,direction);
            }
            else if(elevatorId%2==0&&floor%2==0)
            {
                elevatorController.submitInternalRequest(floor,direction);
            }
        }
    }
}
