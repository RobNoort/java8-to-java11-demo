package java10;

import java.util.List;

public class NewOptionalMethod {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        var ofList = List.of(1, 3, 5, 8);

        Integer firstEven = ofList.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();

        System.out.println(String.format("Result: %s", firstEven.toString()));
    }
}
