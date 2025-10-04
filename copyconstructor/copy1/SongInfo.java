package copyconstructor.copy1;
public class SongInfo {
    public static void main(String[] args) {
        Song s1 = new Song("Shape of You", 4.2);
        Song s2 = new Song(s1);
        s1.display();
        s2.display();
    }
}
