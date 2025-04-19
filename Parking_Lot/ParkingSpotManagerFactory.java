package Parking_Lot;

import java.util.List;

public class ParkingSpotManagerFactory {

    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots)
    {
        if(vehicleType==VehicleType.TwoWheeler)
        {
            return new TwoWheelerManager(spots);
        }
        else if(vehicleType==VehicleType.FourWheeler)
        {
            return new FourWheelerManager(spots);
        }
        else
        {
            return null; //Handle error
        }
    }
}
