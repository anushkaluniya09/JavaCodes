package com.Abstract.Abstract3;

public class Test3 {
    public static void main(String[] args) {
        FileHandler f1 = new TextFile();
        FileHandler f2 = new ImageFile();
        f1.open("notes.txt");
        f2.open("photo.jpg");
    }
}
