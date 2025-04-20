package Car_Rental_System;

import BookMyShow.Payment;

import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {

        List<User> user=addUser();
        List<Vehicle>vehicles=addVehicles();
        List<Store>stores=addStore(vehicles);


        VehicleRentalSystem rentalSystem=new VehicleRentalSystem(stores,user);

        //0 Users Comes
        User user=users.get(0);

        //1 User search stores based on the location
        Location location=new Location(403012,"Bangalore","Karnataka","India");
        Store store=rentalSystem.getStore(location);

        //2 get all vehicle you interested in (based on different filters)
        List<Vehicle>storeVehicle=store.getVehicles(VehicleType.CAR);

        //3 reserving the particular vehicle
        Reservation reservation=store.createReservation(storeVehicle.get(0),users.get(0));

        //4 generate bill
        Bill bill=new Bill(reservation);

        //5 make payment
        Payment payment=new Payment();
        payment.payBill(bill);

        //6 trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationID);
        public static List<Vehicle> addVehicles()
        {
            List<Vehicle>vehicles=new ArrayList<>();
            Vehicle vehicle1=new Car();
            vehicle1.setVehicleID(1);
            vehicle1.setVehicleType(VehicleType.CAR);


            Vehicle vehicle2=new Car();
            vehicle2.setVehicleID(2);
            vehicle2.setVehicleType(VehicleType.CAR);

            vehicles.add(vehicle1);
            vehicles.add(vehicle2);
        }

        public static List<User> addUser()
        {
            List<User>users=new ArrayList<>();
            User user1=new User();
            user1.setUserId(1);
            users.add(user1);
            return users;

        }

        public static List<Store> addStores(List<Vehicle>vehicles)
        {
            List<Store>stores=new ArrayList<>();
            Store store1=new Store();
            store1.storeID=1;
            store1.setVehicle(vehicles);

            stores.add(store1);
            return stores;
        }

    }
}