package NestedClass.Practice9;
public class MusicPlayer {
    static class Playlist {
        String name;
        int songs;
        int duration;

        Playlist(String name, int songs, int duration) {
            this.name = name;
            this.songs = songs;
            this.duration = duration;
        }

        void display() {
            System.out.println("Playlist: " + name);
            System.out.println("Songs: " + songs);
            System.out.println("Total Duration: " + duration + " mins");
        }
    }
}
