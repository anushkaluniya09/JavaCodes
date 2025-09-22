package com.Concrete.Concrete11;

class Podcast {
    private String title;
    private String host;
    private int episodes;

    public Podcast(String title, String host, int episodes) {
        this.title = title;
        this.host = host;
        this.episodes = episodes;
    }

    public void listen() {
        System.out.println("Listening to " + title + " hosted by " + host + " (" + episodes + " episodes)");
    }
}
