package main;

import java.util.ArrayList;

public class Song {
    public static String getVerse(int i) {
        i -= 1;
        if(i < 0 || i > 12) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ArrayList<String> song = FileHelper.readFromFile("song.txt");

        return song.get(i);
    }

    public static String getVerseRange(){
        return "";
    }
}
