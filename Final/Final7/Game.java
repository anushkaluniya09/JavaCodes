package com.Final.Final7;

final class Game {
    private String name;
    private String genre;

    public Game(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void start() {
        System.out.println("Starting Game: " + name + " [" + genre + "]");
    }
}
