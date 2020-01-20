package java11;


import java.util.function.Predicate;

public class StringsDemo {
    public static void main(String[] args) {

        System.out.println("=".repeat(100));
        stringsDemo();
        System.out.println("=".repeat(100));
        multiLinesDemo();
        System.out.println("=".repeat(100));
        stringBuilderDemo();
        System.out.println("=".repeat(100));
    }

    private static void stringsDemo() {

        String repeatedString = "La ".repeat(2) + "Land";
        System.out.println(String.format("Repeated String: %s", repeatedString));

        // old versions
        String trimmedString = "\n\t  hello   \u2005".trim();
        System.out.println(String.format("trimmed String: %s", 'X' + trimmedString + 'X'));

        // strip does more because it is aware of Unicode whitespace characters.
        String strippedString = "\n\t  hello   \u2005".strip();
        System.out.println(String.format("Stripped String: %s", 'X' + strippedString + 'X'));

        // stripLeading()
        // stripTrailing()
        String strippedBothSidedString = "\n\t  hello   \u2005".stripLeading().stripTrailing();
        System.out.println(String.format("Stripped from both sides String: %s", 'X' + strippedString + 'X'));

        // isBlank() also is aware of Unicode whitespace characters
        String notReallyBlank = "\n\t\u2005  ";
        System.out.println(String.format("Not blank String %b : %s", notReallyBlank.isBlank(), 'X'+ notReallyBlank + 'X'));
    }

    private static void multiLinesDemo() {

        String multilineStr = "This is\n \n a multiline\r\n string.";

        // better performance for breaking multi-line input.
        // A line terminator is one of the following: “\n”, “\r”, or “\r\n”.
        long lineCount = multilineStr.lines()
                .count();

        multilineStr.lines()
                .forEach(System.out::println);

        System.out.println(String.format("Line count: %s", lineCount));

        lineCount = multilineStr.lines()
                .filter(Predicate.not(String::isBlank))   // new in 11! beter leesbaar vooral
                .count();

        System.out.println(String.format("Line count filtered: %s", lineCount));

        multilineStr.lines()
                .filter(Predicate.not(String::isBlank))
                .forEach(System.out::println);
    }

    private static void stringBuilderDemo() {
        var sb1 = new StringBuilder("test");
        var sb2 = new StringBuilder("test");
        var sb3 = new StringBuilder("iets anders");

        // als 0 dan gelijk
        System.out.println(String.format(" result compareToSameString : %d ", sb1.compareTo(sb2)));
        System.out.println(String.format(" result compareToDifferentString : %d ", sb1.compareTo(sb3)));
    }
}
