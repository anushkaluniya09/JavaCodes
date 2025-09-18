package Encapsulation.Enp6;
public class Enc6 {
    public static void main(String[] args){
        ATM am=new ATM(600);

        am.deposit(1200);
        am.withdraw(1800);

        System.out.println("Available Balance: " +am.getBalance() );
    }
}
