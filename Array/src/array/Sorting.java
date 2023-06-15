package array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int []number = {12,34,78,-7,-9,2,33};
        
      Arrays.sort(number);
        for (int i = 0; i < 7; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println(" ");
        for (int i = 6; i>=0; i--) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println("");
        
        String[] name ={"Jim","Siam","Kasem","Mr.Mango"};
        Arrays.sort(name);
          for (int i = 0; i < 4; i++) {
              System.out.println(" "+name[i]);
            
        }
    }
}
