package java9;

import static java.util.Map.entry;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String... args) {
        streams();
        intStream();
        ofNullable();
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
        System.out.println("Stream iterat java 9");
        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .forEach(System.out::println);

        // java 8
        System.out.println("IntStream iterate java 8");
        IntStream.iterate(0, i -> i + 2).limit(3).forEach(System.out::println);

        System.out.println("IntStream iterate java 9");
        IntStream.iterate(1, i -> i < 5, i -> ++i)
                .forEach(System.out::println);

    }
    private static  void ofNullable(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        // Immutable Map (java 9)
        Map<Integer,String > map = Map.ofEntries(entry(1,"A"),entry(2,"C") , entry(3,"A"));

        System.out.println(" Handle Nullable Java 8 ");
        // java 8
        numbers.stream()
                .flatMap(s -> {
                    String temp = map.get(s);
                    return temp != null ? Stream.of(temp) : Stream.empty();
                })
                .forEach(System.out::println);

        System.out.println("of Nullable Java 9 ");
        numbers.stream()
                .flatMap(s -> Stream.ofNullable(map.get(s)))
                .forEach(System.out::println);

    }
}
