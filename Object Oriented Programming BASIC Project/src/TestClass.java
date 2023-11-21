import Take_Input.infoList;
public class TestClass {

    public static void main(String[] args) {
        
        System.out.println("***WelCome to OOP Project***\n\n");
        
         infoList info = new infoList("Habib ",23);
         //ArryList Input From User
         info.information();
         info.display();
        
         System.out.println("~~~ Crocodile Information ~~~");
        // Display Crocodile Information
        Crocodile D = new Crocodile("Crocodylidae",17,"12 Feet");
        D.display();
        
        // Human INformation
        System.out.println("\n~~ Human Information ~~\n");
        Human H = new Human("Homo sapiens",23,"67 KG");
        H.display();
        
        //Bird Information
        System.out.println("\n** Bird Information **\n");
        Bird B = new Bird("Aves","Haming-Bird");
        B.display();
        
        System.out.println("\n");
         
        // Exception Handalling
        int x=10;
        int y= 0;

        try{
            int num = x/y ;
            System.out.println(num);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
     
        
 //Method OverLoading
TestClass obj=new TestClass();
obj.sum(10.5,10.5);
obj.sum(20,10);
        System.out.println();
    }
    
void sum(int a,int b)
{
System.out.println(a+b);
}
void sum(double a, double b)
{
System.out.println(a+b);
}


}
