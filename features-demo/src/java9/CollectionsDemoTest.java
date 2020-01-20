package java9;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class CollectionsDemoTest {

    public static void main(String[] args) {
        collectionsOfTest();
        immutableListTest();
    }

    private static void collectionsOfTest() {

        System.out.println("java 8 version");
        Stream.of("foo", "bar", "baz")
                .collect(Collectors.collectingAndThen(toSet(), Collections::unmodifiableSet)).forEach(System.out::println);

        System.out.println("java 9 version");
       Set.of("foo", "bar", "baz").forEach(System.out::println);

        List<Integer> list2 = List.of(1);
        System.out.println(list2.getClass().getCanonicalName());

        Map<Integer, String> map = Map.of(1, "1", 2, "2", 3, "3");
        System.out.println(list2.getClass().getCanonicalName());
    }

    private static void immutableListTest() {
        List<Integer> listN = List.of(1, 2, 3);
        System.out.println(listN.getClass());
        listN.add(4); // error, it's immutable


    }
}
