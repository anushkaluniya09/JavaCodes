package com.Final.Final10;

final class Music {
    private String songName;
    private String artist;

    public Music(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing: " + songName + " by " + artist);
    }
}
