
package Business.Restaurant;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurentList;

    public RestaurantDirectory() {
        restaurentList = new ArrayList<>();
    }

    public ArrayList<Restaurant> getRestaurentList() {
        return restaurentList;
    }

    public void setRestaurentList(ArrayList<Restaurant> restaurentList) {
        this.restaurentList = restaurentList;
    }
    
    public Restaurant createRestaurant(String restName, String restMan, int phoneNumber, String address, UserAccount userAccount){
        Restaurant r = new Restaurant();
        r.setRestaurentName(restName);
        r.setRestaurentManager(restMan);
        r.setPhoneNumber(phoneNumber);
        r.setAddress(address);
        r.setUserAccount(userAccount);
        restaurentList.add(r);  
        return r;
    }
    
    public Restaurant updateRestaurant(String restName, String restMan, int phoneNumber, String address, UserAccount userAccount){
        Restaurant r = new Restaurant();
        r.setRestaurentName(restName);
        r.setRestaurentManager(restMan);
        r.setPhoneNumber(phoneNumber);
        r.setAddress(address);
        r.setUserAccount(userAccount);
        restaurentList.add(r);  
        return r;
    }
    
    public void deleteRestaurant(Restaurant restaurant) {
        restaurentList.remove(restaurant);
    }
}
