package Car_Rental_System;

import java.awt.*;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList;
    VehicleInventoryManagement(List<Vehicle>vehicleList)
    {
        this.vehicleList=vehicleList;
    }
    public List<Vehicle> getVehicle()
    {
        //filtering
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle>vehicleList)
    {
        this.vehicleList=vehicleList;
    }
}
