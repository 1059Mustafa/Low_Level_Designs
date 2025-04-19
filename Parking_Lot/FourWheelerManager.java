package Parking_Lot;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{
    FourWheelerManager(List<ParkingSpot>spots)
    {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace()
    {
        //Implementation to find nearest parking spot for 4 wheelers;
        return null;
    }
}
