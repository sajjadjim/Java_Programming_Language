package pattern1;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column ,n ;

        System.out.print("Enter the value of n =");
        n = input.nextInt();
                        
        for ( row = n; row >= 1; row--) 
        {
           for(column = 1; column <=row ; column ++)
           {             
               System.out.print(" * ");
           } 
            System.out.println();
        }
       
    }
}

