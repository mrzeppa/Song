package main;

import java.io.File;
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

    public static String getVerseRange(int a, int b){
        if(a > b)
            throw new ArrayIndexOutOfBoundsException();
        if(a < 0 || b < 0)
            throw new ArrayIndexOutOfBoundsException();
        if(a > 12 || b > 12)
            throw new ArrayIndexOutOfBoundsException();

        ArrayList<String> song = FileHelper.readFromFile("song.txt");
        StringBuilder sb = new StringBuilder();
        for(int i = a; i <= b; ++i) {
            sb.append(song.get(i));
            if(i != b)
                sb.append("\n");

        }
        return sb.toString();
    }


    public static String getSong(){
        return "";
    }
}
