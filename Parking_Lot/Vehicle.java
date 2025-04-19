package Parking_Lot;

enum VehicleType{
    TwoWheeler,
    FourWheeler;
}
public class Vehicle {

    int vehicleNo;
    VehicleType vehicleType;
    //constructor
    Vehicle(int vehicleNo, VehicleType vehicleType)
    {
        this.vehicleNo=vehicleNo;
        this.vehicleType=vehicleType;
    }


}
