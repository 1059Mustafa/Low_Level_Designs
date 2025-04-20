package Car_Rental_System;

import java.awt.*;
import java.util.ArrayList;

public class Store {
    int storeId;
    Location location;
    List<Reservation>reservationList=new ArrayList<>();
    VehicleInventoryManagement inventoryManagement;


    public List<Vehicle> getVehicles(VehicleType vehicleType)
    {
        return inventoryManagement.getVehicle();
    }
    //add vehicle remove vehicle update vehicle use inventory management to update those

    public void setVehicles(List<Vehicle>vehicles)
    {
        inventoryManagement=new VehicleInventoryManagement(vehicles);
    }
    public Reservation createReservation(Vehicle vehicle,User user)
    {
        Reservation reservation=new Reservation();
        reservation.createReserve(user,vehicle);
        return reservation;
    }

    public boolean completeReservation(int reservationID)
    {
        // take out the reservation from the listand call complete the reservation method
        return true;
    }

    //Update reservation
}
