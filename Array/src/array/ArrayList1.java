package array;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(3, 400);
        System.out.println(+number.size());
        System.out.println("Array lIST contain =" + number);
        //Sytem.out.println(number);
        /*    for( int x : number){
             System.out.println(" "+x);
             
         } */
        number.remove(3);
        System.out.println("After Remove One Element =" + number);

        number.removeAll(number);
        System.out.print("After Remove All Number= " + number);
    }

}
