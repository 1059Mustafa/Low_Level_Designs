package Parking_Lot;

import java.util.List;

public class EntryGate {

    ParkingSpotManagerFactory factory;
    EntryGate(ParkingSpotManagerFactory factory)
    {
        this.factory=factory;
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots)
    {
        ParkingSpotManager manager=factory.getParkingSpotManager(vehicleType,spots);
        return manager.findParkingSpace();
    }

    Ticket generateTicket(Vehicle vehicle,ParkingSpot parkingSpot)
    {
        //implementation to generate ticket
        return null;
    }
}
