package Encapsulation.Enp3;

class Subtraction{
    private int a;
    private int b;

    Subtraction(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void getSubtraction(){
        int subtraction=a-b;
        System.out.println(subtraction);
    }
}
