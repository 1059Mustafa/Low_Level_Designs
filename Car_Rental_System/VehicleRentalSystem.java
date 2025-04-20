package Car_Rental_System;
import java.util.List;

public class VehicleRentalSystem {
    List<User> userList;
    List<Store>storeList;

    VehicleRentalSystem(List<User>users,List<Store>store)
    {
        this.userList=users;
        this.storeList=store;
    }
    public Store getStore(Location location)
    {
        //based on the location we will filter out the store from the store list
        return storeList.get(location);
    }

    //add users
    //remove users
    //add stores
    //remove stores
}
