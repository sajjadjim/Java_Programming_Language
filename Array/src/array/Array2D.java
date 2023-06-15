package array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][]A = new int[3][3];
        int[][]B = new int[3][3];
        System.out.println("Enter A matrix Value=");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d]= ",i,j);                        
               A[i][j]= input .nextInt();
            }
            System.out.println();
            
        }
        System.out.print("A = ");
             for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+A[i][j] );
            }
                 System.out.println();
        }
             
             
                     System.out.println("Enter B matrix Value=");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d]= ",i,j);                        
               B[i][j]= input .nextInt();
            }
            System.out.println();
            
        }
        System.out.print("B =");
             for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+B[i][j] );
            }
                 System.out.println();
        }
             
             int[][]sum = new int[3][3];
             
             for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
                     sum[i][j] = A[i][j] + B[i][j];
                     
                 }
             }
             
             System.out.println("The Sum of A And B Matrix = ");
                 for (int i = 0; i < 3; i++) {
                     for (int j = 0; j <3; j++) {
                         System.out.print("\t"+sum[i][j]);
                         
                     }
                     System.out.println();
                     
                 }
   
              
        
             
        
    }
   
}


