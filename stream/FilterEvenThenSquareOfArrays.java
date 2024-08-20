package stream;

import java.util.Arrays;
import java.util.List;

public class FilterEvenThenSquareOfArrays {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0) // Intermediate operation
                .map(n -> n * n)         // Intermediate operation
                .forEach(System.out::println); // Terminal operation
    }
}
