package Parking_Lot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //Initialize parking spots
        List<ParkingSpot>spots=new ArrayList<>();

        for(int i=0;i<=100;i++)
        {
            if(i<=50)
            {
                spots.add(new ParkingSpot(i,10));
            }
            else
            {
                spots.add(new ParkingSpot(i,20));

            }
        }
        //Create ParkingSpotManagerFactory
        ParkingSpotManagerFactory factory=new ParkingSpotManagerFactory();

        //Create Entry and Exit Gates objects
        EntryGate entryGate=new EntryGate(factory);
        ExitGate exitGate=new ExitGate((factory));

        //Example usage
        Vehicle vehicle=new Vehicle(123,VehicleType.TwoWheeler);
        ParkingSpot spot=entryGate.findParkingSpace(vehicle.vehicleType,spots);
        Ticket ticket=entryGate.generateTicket(vehicle,spot);

        //Vehicle leave
        exitGate.removeVehicle(ticket);

    }
}
