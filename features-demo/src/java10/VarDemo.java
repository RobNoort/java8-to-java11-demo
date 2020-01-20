package java10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class VarDemo {

    // var test    // not working, only in methods

    public static void main(String... args){

        // The only other eligible spots besides local variables are for loops and try-with-resources blocks

        var str = "Java 10"; // infers String
        var list = new ArrayList<String>(); // infers ArrayList<String>
        var stream = list.stream(); // infers Stream<String>

        // java 9
        Map<Integer, String> map9 = new HashMap<>();
        // java 10
        var map10 = new HashMap<Integer, String>();

//        var count = null; // nope
//        var book; // nope

        var list1 = List.of(1, 2.0, "3");   // infers "java.util.ImmutableCollections.ListN"
        var list2 = new ArrayList<>();      //infers ArrayList<Object>

        // versie  11 ook in lambda:
        BiConsumer<String, String> sup = (var s1, var s2) -> {
            System.out.println(s1 + s2);};

        // gegenereerde type kan je gemakkelijk in jshell zien
    }
}
