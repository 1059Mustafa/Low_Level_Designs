package Parking_Lot;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{
    TwoWheelerManager(List<ParkingSpot> spots)
    {
        super(spots);
    }
    @Override
    ParkingSpot findParkingSpace()
    {
        //Implement to find nearest parking spot for two wheelers
        return null;
    }
}
