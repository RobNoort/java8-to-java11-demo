package java11;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VarLambdaDemoTest {

    public static void main(@Deprecated String... args) {
        var list = List.of("a", "b", "c");

        list.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        list.stream()
                .map((var s) -> s.toLowerCase()) // doesn't make much sense
                .collect(Collectors.toList());

        Optional.of("2").isEmpty();
        list.stream()
                .map((@NotNull var s) -> s.toLowerCase()) //maybe makes sense
                .collect(Collectors.toList());
    }

    private @interface NotNull {

    }
}
