package practice;

import java.util.Scanner;

public class Search {

    String name;
///////////////////////////////////////////////////////
    public void insertvalue(String sname) {
        this.name = sname;
    }

////////////////////////////////////////////////////////
    public void SearchName(Search[] array, String searchname, int n) {
        int i, index = 0;
        int flag = 0;

        for (i = 0; i < n; i++) {

            if (array[i].name.equalsIgnoreCase(searchname)) {
                flag = 1;
                index = i;
            }
            if (flag == 1) {
                System.out.println("Name Found AT " + index + " Index");
            } else if (flag == 0) {
                System.out.println("Array Not Fount In Index");
            }
        }
    }

    ///////////////////// Display Method ////////////////////////////////   
    void display() {
        System.out.println("Name :" + this.name);
    }
    
    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("Enter How many You want :");
        n = input.nextInt();
        Search[] array = new Search[n];
        System.out.println("Enter Number Array");
        for (i = 0; i < n; i++) {
            array[i] = new Search();
            System.out.print("Enter Name :");
            String sname = input.next();
            array[i].insertvalue(sname);
        }
        for (i = 0; i < n; i++) {
            array[i].display();
        }

        //////////////////////////////////////////////////////
        System.out.print(" Enter the Name Search :");
        String searchname = input.next();
        Search obj = new Search();
        obj.SearchName(array, searchname, n);

        //////////////////////////////////////////////////////////////
        System.out.print("Enter The Name Number You want :");
        int deleteIndex = input.nextInt();
        array[deleteIndex] = null;

        System.out.println("** After Delete The Name List **");
        for (i = 0; i < n; i++) {
            if (array[i] != null) {
                array[i].display();
            }
        }
    }
}
