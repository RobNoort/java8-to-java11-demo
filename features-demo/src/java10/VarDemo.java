package java10;

import java.util.ArrayList;
import java.util.List;

public class VarDemo {

    public static void main(String... args){
        var str = "Java 10"; // infers String
        var list = new ArrayList<String>(); // infers ArrayList<String>
        var stream = list.stream(); // infers Stream<String>

//        var count = null; // nope
//        var book; // nope

        var list1 = List.of(1, 2.0, "3"); // infers List<? extends Serializable & Comparable<..>>
        var list2 = new ArrayList<>(); //infers ArrayList<Object>
    }
}
