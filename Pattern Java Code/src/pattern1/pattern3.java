
package pattern1;

import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column ,n ;

        System.out.print("Enter the value of n =");
        n = input.nextInt();
                        
        for ( row = 0; row < n; row++) 
        {
           for(column = 0; column < row ; column ++)
           {             
               System.out.print(" "+row);
           } 
            System.out.println();
        }
       
    }
}  

