package Polymorphism.Poly5;
public class P5 {
    public static void main(String[] args){
        Bank b1=new BOI();
        Bank b2=new SBI();

        System.out.println("BOI Interest Rate:"+b1.getRateOfInterest()+"%");
        System.out.println("SBI Interest Rate:"+b2.getRateOfInterest()+"%");

    }
}
