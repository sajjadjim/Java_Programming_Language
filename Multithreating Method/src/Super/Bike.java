
package Super;


public class Bike extends Veichle {
 int speed=100;
  void display(){
      System.out.println(super.speed);
  }
    public static void main(String[] args) {
        Bike b =new Bike();
        b.display();
    }
}
