package java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatesDemo {

    public static void main(String... args) {
        var list = List.of("a", "b");

        list.stream()
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());

        list.stream()
                .filter(Predicate.not(String::isEmpty))
                .collect(Collectors.toList());
    }
}
