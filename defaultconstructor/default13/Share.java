package defaultconstructor.default13;

public class Share {
    private String share;
    private double price;

    protected Share() {
        share = "SBI Bank Ltd.";
        price = 745.05;
    }

    protected void show() {
        System.out.println(share + " - " + price);
    }
}
