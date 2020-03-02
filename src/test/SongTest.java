package test;

import main.Song;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest {

    @Test
    public void methodWithGiven_1ShouldReturnFirstVerse(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.", Song.getVerse(1));
    }

}