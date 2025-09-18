package Encapsulation.Enp4;

class Multiplication{
    private int c;
    private int d;

    Multiplication(int c,int d){
        this.c=c;
        this.d=d;
    }
    public void getMultiplication(){
        int multiplication=c*d;
        System.out.println(multiplication);
    }
}
