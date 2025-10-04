package defaultconstructor.default10;

public class YouTubeVideo {
    String title;
    int views;

    YouTubeVideo() {
        title = "Funny Video";
        views = 150;
    }

    void play() {
        System.out.println("Video: " + title + ", Views: " + views);
    }
}
