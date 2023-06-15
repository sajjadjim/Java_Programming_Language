package array;

import java.util.Scanner;

public class Multification {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Matrix number of row =");
        int x  = input.nextInt();
        System.out.print("Enter Your Matrix number of column =");
        int y = input.nextInt();
        int[][] A = new int[x][y];
        int[][] B = new int[x][y];
        int[][] multi = new int[x][y];

         System.out.printf("Enter A[%d][%d] matrix Value=\n",x,y);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("A[%d][%d]=", i, j);
                A[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.printf("Enter B[%d][%d] matrix Value=\n",x,y);
        for (int i = 0; i <x; i++) {
            for (int j = 0; j <y; j++) {
                System.out.printf("B[%d][%d]=", i, j);
                B[i][j] = input.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i <x; i++) {
            for (int j = 0; j <y; j++) {
                multi[i][j] = A[i][j] * B[i][j];
            }
        }

        System.out.println("Multification Value =");
        for (int i = 0; i <x; i++) {
            for (int j = 0; j <y; j++) {
                System.out.print("\t"+multi[i][j]);
            }
            System.out.println();
        }

    }
}
