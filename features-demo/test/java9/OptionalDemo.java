package java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

    public static void main(String... args) {
        optionals();
    }

    private static void optionals() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        Optional<Integer> first = numbers.stream()
                .findFirst();

        // ifPresentOrElse
        first.ifPresent(System.out::println); // java 8

        first.ifPresentOrElse(System.out::println, () -> System.out.println(-1)); // java 9

        // or
        Integer result = first.orElse(-1); // java 8

        Optional<Integer> or = first.or(() -> Optional.of(5)); // java 9

        // stream
        Stream<Integer> values = !first.isPresent() ? Stream.empty() : Stream.of(first.get()); // java 8

        values = first.map(Stream::of)
                .orElseGet(Stream::empty); // java 8

        values = first.stream(); // java 9
    }
}
