package java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

    public static void main(String... args) {
        optionals();
    }

    private static void optionals() {
        // immutable
        List<Integer> numbers = List.of(5,6,7);

        Optional<Integer> first = numbers.stream()
                .findFirst();

        System.out.println("java 8 ifPresent");
        first.ifPresent(System.out::println); // java 8

        // ifPresentOrElse
        //  We can pass a Consumer that will be invoked if the Optional is defined,
        //  and Runnable that will be executed if the Optional is empty

        System.out.println("java 9 - ifPresentOrElse");
        first.ifPresentOrElse(System.out::println, () -> System.out.println("Not found")); // java 9

        // or
        Integer result = first.orElse(-1); // java 8
        System.out.println( String.format( "java 8 firstOrElse:  %s",result)); // java 8

        // returns another Optional lazily
        System.out.println("java 9 - or");
        Optional<Integer> optionalOf = first.or(() -> Optional.of(5));
        optionalOf.stream().forEach(System.out::println); // java 9

        System.out.println("java 8 ternary ");
        Stream<Integer> values = !first.isPresent() ? Stream.empty() : Stream.of(first.get()); // java 8
        values.forEach(System.out::println);

        System.out.println("java 8 orElseGet");
        first.map(Stream::of)
                .orElseGet(Stream::empty)
                .forEach(System.out::println); // java 8

        System.out.println("java 9 ");
        first.stream().forEach(System.out::println); // java 9

    }
}
