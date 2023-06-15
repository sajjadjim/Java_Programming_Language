package pattern1;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row , column,n;
        System.out.print("Enter How many Pattern You want :");
        n = input.nextInt();
        
        //Forward
        for ( row = 0; row < n; row++) {
            for ( column = 0; column < row; column++) 
            {
                System.out.print(" * "); 
            }
            System.out.println(); 
        }
        
        // Reverse
                for ( row = n-2; row > 0; row--) {
            for ( column = 0; column < row; column++) {
                System.out.print(" * "); 
            }
            System.out.println(); 
        }
        
    }
    
}
