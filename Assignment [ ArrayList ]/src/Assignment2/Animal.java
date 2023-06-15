package Assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    String name;
    int age;
    String food;
 Animal(String name , int age , String food){
    this.name = name;
    this.age = age;
    this.food = food;

 }
 void setName(String name){
    this.name = name ;

 }
 void setAge(int age){
    this.age = age;
 }
void setFood(String food){
    this.food = food ;
}

String getName(){
    return name;
}
int getAge(){
    return age;
}
String getFood(){
    return food;
}

void Display(){
    System.out.println("Name : "+this.name);
    System.out.println("Age : "+this.age);
    System.out.println("Food : "+this.food);
    System.out.println();
}
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Animal Number :");
        int N = input.nextInt();

        System.out.println("\n");

        for(int i= 0 ; i < N; i++){
            System.out.print("Enter Animal Name : ");
            String aName = input.next();

            System.out.print("Enter Age : ");
            int aAge = input.nextInt();

            System.out.print("Enter Food : ");
            String aFood = input.next();
            animalList.add(new Animal(aName,aAge,aFood));
            System.out.println();
        }

        System.out.println("\n ** Display Animal List ** \n");
        for(int i = 0 ; i < animalList.size();i++)
        {
          animalList.get(i).Display();  
        }
        
        System.out.print("\nEnter age of Animal which You want to search : ");
        int animalAge = input.nextInt(); 
        int flag = 0;

        for(int i = 0 ; i< animalList.size(); i ++){
        if(animalAge == animalList.get(i).getAge()){
            System.out.println("Found In "+(i+1)+" Number Serial Animal");
            flag = 1;
            break;
        }
        }
        if(flag == 0){
        System.out.println(" Not Found in Any Index ");
        }
        
        System.out.println("\n ** Edit Animal Information **");
        System.out.print("Enter Index Number which you want to update :");
        int IndexNumber =input.nextInt();

        System.out.print("Enter new name : ");
        String nName = input.next();
        System.out.print("Enter new Age : ");
        int nAge = input.nextInt();
        System.out.print("Enter new Food : ");
        String nFood = input.next();

      // animalList.add(IndexNumber, new Animal(nName,nAge,nFood));

       animalList.get(IndexNumber).setName(nName);
       animalList.get(IndexNumber).setAge(nAge);
       animalList.get(IndexNumber).setFood(nFood);
        
       for(int i =0 ; i < animalList.size(); i++){
        System.out.println("\n");
        animalList.get(i).Display();
       }
       
        System.out.println("** Remove The Information **");
        int delete = input.nextInt();
        animalList.remove(delete);
        
        System.out.println(" After Delete Information  Display");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println("Name : "+animalList.get(i).getName());
            System.out.println("Age : "+animalList.get(i).getAge());
            System.out.println("Food Name : "+animalList.get(i).getFood());
          //  animalList.get(i).Display();
        }
    }
}



