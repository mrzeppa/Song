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

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void negativeArgumentShouldRaiseException() {
        Song.getVerse(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void argumentOutOfRangeShouldRaiseAnException(){
        Song.getVerse(5000);
    }

    @Test
    public void methodWithGivenRangeShouldReturnRangeInThatRange(){
        String result =
                "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.";
        assertEquals(result, Song.getVerseRange());
    }

    @Test
    public void zeroRangeTest(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.", Song.getVerseRange());
    }


}