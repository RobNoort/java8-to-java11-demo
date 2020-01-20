package java9.helpers;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public interface ExampleInterface
{
    default int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }

    default int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }

    // PRIVATE METHOD JAVA 9
    private int add(IntPredicate predicate, int... nums) {
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
}
