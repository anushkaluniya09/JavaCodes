package com.Static.Static16;

class Museum {
    static class Exhibit {
        String artifact;
        Exhibit(String artifact) { this.artifact = artifact; }
        void showExhibit() { System.out.println("Artifact: " + artifact); }
    }
}
