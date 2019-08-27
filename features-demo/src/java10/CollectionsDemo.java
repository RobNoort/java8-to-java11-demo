package java10;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

    public static void main(String... args) {
        var originalList = List.of(1, 2, 3);
        var copiedList = List.copyOf(originalList);

        System.out.println(originalList.getClass());
        System.out.println(copiedList.getClass());

        // same for Map.copyOf and Set.copyOf
    }
}
