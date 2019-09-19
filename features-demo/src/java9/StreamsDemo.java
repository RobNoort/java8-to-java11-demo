package java9;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void main(String... args) {
        streams();
//        intStream();
    }

    private static void streams() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        // java 9
        System.out.println("Java 9 takeWhile:");
        numbers.stream()
                .takeWhile(number -> number < 4)
                .forEach(System.out::println);

        System.out.println("Java 9 dropWhile:");
        numbers.stream()
                .dropWhile(number -> number < 4)
                .forEach(System.out::println);
    }

    private static void intStream() {
        // java 8
        IntStream.range(0, 5)
                .forEach(System.out::println);

        // java 9
        IntStream.iterate(0, i -> i < 5, i -> i++)
                .forEach(System.out::println);
    }
}
