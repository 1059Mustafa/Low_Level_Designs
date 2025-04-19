package Parking_Lot;

public class Ticket {
    long entryTime;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    //Constructor
    Ticket(long entryTime,ParkingSpot parkingSpot,Vehicle vehicle)
    {
        this.entryTime=entryTime;
        this.parkingSpot=parkingSpot;
        this.vehicle=vehicle;

    }


}
