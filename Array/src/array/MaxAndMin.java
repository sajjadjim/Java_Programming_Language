package array;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.print("Enter 5 number = ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }       
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Total number sof sum =" + sum);
        double max = num[0];        
        for (int i = 1; i < num.length; i++) {            
         if(max<num[i])
         {
             max= num[i];
         }
        }
        System.out.println("The max number= "+max);     
        
        double min = num[0];       
        for (int i = 01; i < num.length; i++) {
              if(min>num[i])
              {
                  min = num[i];
        }
        }
       System.out.println("The minimum Number= "+min);  
    }
}
