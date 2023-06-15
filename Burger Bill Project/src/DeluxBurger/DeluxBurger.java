package DeluxBurger;
import Burger.Burger;
public class DeluxBurger extends Burger{
    
    public DeluxBurger(Boolean Bur) {
        super(Bur);
        super.addExtraCheese();
        super.getWaterPrice();
    }
    
    @Override
    public void getWaterPrice() {
        super.getWaterPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void addExtraCheese() {
        super.addExtraCheese(); 
    }
    
}
