package copyconstructor.copy3;

public class Iteam {
    private String iteam;
    private int quantity;

    public Iteam(String item, int quantity) {
        this.iteam = iteam;
        this.quantity = quantity;
    }

    public Iteam(Iteam other) {
        this.iteam = other.iteam;
        this.quantity = other.quantity;
    }
    public String toString(){
        return iteam + " - " + quantity;
    }
}

