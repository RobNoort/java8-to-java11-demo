package java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String... args) {
        var mutableList = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(mutableList.getClass());
        mutableList.add(4);

        var immutableList = mutableList.stream()
                .map(Integer::bitCount)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList.getClass());
//        immutableList.add(3); // error

        // same for toUnmodifiableMap, toUnmodifiableSet
    }
}
