package copyconstructor.copy1;
public class Song {
    String title;
    double duration;

    Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    Song(Song s) {
        this.title = s.title;
        this.duration = s.duration;
    }

    void display() {
        System.out.println("Song: " + title + ", Duration: " + duration + " mins");
    }

}
