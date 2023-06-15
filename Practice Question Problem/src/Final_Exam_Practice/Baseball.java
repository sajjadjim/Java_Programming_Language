package Final_Exam_Practice;

public class Baseball extends Ball {
    
    public Baseball(String brandName) {
        super(brandName);
    }
    
    @Override
    public void toss(){
        System.out.println("Play start Before Toss........");
    }
    @Override
    public void bounce(){
        toss();
        System.out.println(getBrandName()+" is not bounce");
        
    }
    
}
