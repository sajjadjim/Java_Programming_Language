package practice;
public class MethodOverloading {
 
  
     void sum(int a, int b)
     {  
         System.out.println(a+b);    
     }     
  
     void sum(double a,double b){
         
     }

  public static void main(String[] args) {
 
      MethodOverloading  obj = new MethodOverloading();  
      obj.sum(20,20);  
      obj.sum(10, 50);
  }  
}
 

