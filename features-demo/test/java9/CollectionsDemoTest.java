package java9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemoTest {

    @Test
    public void collectionsOfTest() {

        List<Integer> list2 = List.of(1);
        assertEquals(list2.getClass().getCanonicalName(),"java.util.ImmutableCollections.List12");


        Set<Integer> set = Set.of(1, 2, 3);
        assertEquals(list2.getClass().getCanonicalName(),"java.util.ImmutableCollections.SetN");


        Map<Integer, String> map = Map.of(1, "1", 2, "2", 3, "3");
        assertEquals(list2.getClass().getCanonicalName(),"java.util.ImmutableCollections.MapN");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void immutableListTest() {
        List<Integer> listN = List.of(1, 2, 3);
        System.out.println(listN.getClass());
        listN.add(4); // error, it's immutable


    }
}
