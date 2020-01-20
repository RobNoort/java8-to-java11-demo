package java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutabilityHelpersDemo {

    public static void main(String... args) {

        var list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        // java 9
        var ofList = List.of(1, 2, 3);

        // create an immutable copy of a list java 10
        var copiedList = List.copyOf(list);
        // same for Map.copyOf and Set.copyOf

        // java 10
        var madeUnmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());
        // same for toUnmodifiableMap, toUnmodifiableSet

        System.out.println(String.format("Self created list: %s",list.getClass()));
        System.out.println(String.format("Of created list: %s",ofList.getClass()));
        System.out.println(String.format("Made Unmodifiable list: %s",madeUnmodifiableList.getClass()));
        System.out.println(String.format("Copied list: %s",copiedList.getClass()));


    }
}
