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
        assertEquals(result, Song.getVerseRange(0, 1));
    }

    @Test
    public void zeroRangeTest(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.", Song.getVerseRange(0, 0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void outOfRangeTest(){
        Song.getVerseRange(23, 540);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void firstRangeGreaterThanSecond(){
        Song.getVerseRange(500, 1);
    }

    @Test
    public void wholeSongByVerseRangeTest() {
        String result = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
        assertEquals(result, Song.getVerseRange(0, 11));
    }

}