
package MultipleInterface;

public class DemoClass implements FirstIF,SecondIF {
    @Override
    public void MyMethod(){
        System.out.println(" This is First Interface Method ");
    } 
    @Override
    public void otherMethod(){
        System.out.println(" This is second Interface Method ");
    }
}
