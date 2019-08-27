package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String... args) {
        List<Integer> listN = List.of(1, 2, 3);
        System.out.println(listN.getClass());
//        list.add(4); // error, it's immutable

        List<Integer> list2 = List.of(1);
        System.out.println(list2.getClass());

        Set<Integer> set = Set.of(1, 2, 3);
        System.out.println(set.getClass());

        Map<Integer, String> map = Map.of(1, "1", 2, "2", 3, "3");
        System.out.println(map.getClass());
    }
}
