package test;

import main.Song;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest {

    @Test
    public void methodWithGiven_1ShouldReturnFirstVerse(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.", Song.getVerse(1));
    }

    @Test
    public void methodWithGiven_2ShouldReturnSecondVerse(){
        assertEquals("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.", Song.getVerse(2));
    }

    @Test
    public void methodWithGiven_5ShouldReturnFifthVerse(){
        assertEquals("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.", Song.getVerse(5));
    }

    @Test
    public void methodWithGivenNumberOfVerseShouldNotReturnEmptyString(){
        assertNotEquals("", Song.getVerse(1));
    }

}