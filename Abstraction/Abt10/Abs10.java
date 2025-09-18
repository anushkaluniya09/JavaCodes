package Abstraction.Abt10;
        public class Abs10 {
            public static void main(String [] ags) {
                Payement p1=new UPI();
                Payement p2=new Card();
                p1.pay();
                p2.pay();
}
}
