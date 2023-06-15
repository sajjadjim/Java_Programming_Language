package If_Else;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value (10 / 20 / other )  : ");
        int  value = input.nextInt();

        if (value == 10) {
            System.out.println("Print value =" + value);        // Conditional Method
        } 
        else if (value == 20) {
            System.out.println("Print Value =" + value);            // Conditional Method
        } else {
            System.out.println("You are input another Value = "+value);  // UnConditional else Method
        }
    }

}
