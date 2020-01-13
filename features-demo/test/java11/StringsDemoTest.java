package java11;


import org.junit.Test;

import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringsDemoTest {

    @Test
    public void whenRepeatStringTwice_thenGetStringTwice() {
        String repeatedString = "La ".repeat(2) + "Land";

        assertEquals(repeatedString,"La La Land");
    }

    @Test
    public void whenStripString_thenReturnStringWithoutWhitespaces() {
        String strippedString = "\n\t  hello   \u2005".strip();


        assertEquals(strippedString,"hello");
    }

    @Test
    public void whenBlankString_thenReturnTrue() {

        String notReallyBlank = "\n\t\u2005  ";

        assertTrue(notReallyBlank.isBlank());
    }


    @Test
    public void whenMultilineString_thenReturnLineCount() {
        String multilineStr = "This is\n \n a multiline\n string.";

        // better performance for breaking multi-line input.
        long lineCount = multilineStr.lines()
                .count();

        multilineStr.lines()
                .forEach(System.out::println);

        assertEquals(4L , lineCount);    // count of all lines with data so no blanks

    }

    @Test
    public void whenMultilineString_thenReturnNonEmptyLineCount() {
        String multilineStr = "This is\n \n a multiline\n string.";

        // better performance for breaking multi-line input.
        long lineCount = multilineStr.lines()
                .filter(Predicate.not(String::isBlank))
                .count();

        multilineStr.lines()
                 .filter(Predicate.not(String::isBlank))
                 .forEach(System.out::println);

        assertEquals(3L , lineCount);    // count of all lines with data so no blanks

    }
}
