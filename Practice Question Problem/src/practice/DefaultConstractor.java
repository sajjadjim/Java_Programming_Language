package practice;

public class DefaultConstractor {
   String name;
   int age;
   
   DefaultConstractor(){
       name ="SajjadJim";
       age = 25;
   }
   public void insert(String sname,int sage){
       this.name= sname;
       this.age = sage; 
   }

       public void display(){
       System.out.println("Name :"+this.name);
       System.out.println("Age :"+this.age);
   }

   public  DefaultConstractor(String sname, int sage){
       this.name = sname;
       this.age = sage;
       
   }
    public static void main(String[] args) {
        DefaultConstractor man1 = new DefaultConstractor();
        DefaultConstractor man2 = new DefaultConstractor();
        DefaultConstractor man3 = new DefaultConstractor("Siam KIng",13);
        
        man2.insert("Umme Salma", 25);
        
        man1.display();
        man2.display();
        man3.display();
    }
}
