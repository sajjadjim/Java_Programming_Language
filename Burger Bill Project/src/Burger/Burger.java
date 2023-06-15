package Burger;
public class Burger implements Bill{
    public int price;
    public int baseBurgerPrice;
    public Boolean Bur;
    public int extraCheese = 70;
    public int teaPrice = 50;
    public int Water = 25;

    private Boolean extraSugerAdd= false;
    private Boolean extraWater= false;
    private Boolean extraTea = false;

    public Burger(Boolean Bur) {
        this.Bur = Bur;
        if(this.Bur){
            this.price = 500;
        }
        else{
            this.price = 400;
        }
        baseBurgerPrice = this.price;
    }
    
    public void addExtraCheese()
    {
        extraSugerAdd= true;
        this.price = price + extraCheese;
    }
    
    @Override
    public void getWaterPrice(){
        extraWater= true;
        this.price = price +Water;
    }
    
    @Override
    public void getTeaPrice(){
        extraTea = true;
        this.price = price + teaPrice;
    }
  
    @Override
    public void getBill(){
        String Bill = "";
        System.out.println("Burger Bill Only : "+this.baseBurgerPrice+" Taka");
        
        if(extraSugerAdd){
            Bill += "Extra Suger Added = " +extraCheese+ " Taka\n";
            
        }
        if(extraWater){
            Bill += "Water Order Done =" +Water+ " Taka\n";
            
        }
        if(extraTea){
            Bill +=  "Extra Tea Order Done = " +teaPrice+ " Taka \n";
            
        }
         Bill += "Total Bill : " +this.price + " Taka\n";
        System.out.println( Bill);
        
    }
}
