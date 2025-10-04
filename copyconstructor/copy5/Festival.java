package copyconstructor.copy5;
public class Festival {
    String name;
    String month;

    Festival(String n, String m) {
        name = n;
        month = m;
    }

    Festival(Festival f) {
        name = f.name;
        month = f.month;
    }

    void show() {
        System.out.println("Festival: " + name + ", Month: " + month);
    }
}
