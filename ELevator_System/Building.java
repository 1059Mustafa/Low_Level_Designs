package ELevator_System;

import java.util.List;

public class Building {
    List<Floor>floorList;

    Building(List<Floor> floors)
    {
        this.floorList=floors;
    }
    public void addFloors(Floor newFloor)
    {
        floorList.add(newFloor);
    }
    public void removeFloor(Floor removeFloor)
    {
        floorList.remove(removeFloor);
    }
    List<Floor> getFloorList()
    {
        return floorList;
    }
}
