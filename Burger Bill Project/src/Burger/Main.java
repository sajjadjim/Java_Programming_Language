package Burger;
import DeluxBurger.DeluxBurger;
public class Main {
    public static void main(String[] args) {
        
          DeluxBurger DB = new DeluxBurger(false);  // Boolean    //True = 500 taka   ~~ false = 400 Taka
          DB.getTeaPrice();
          DB.getBill();
    }
}
