package logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationOfGivenNum {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 0, 3, 6,-1};
        int num = 6;
        printCombination(arr,num);
//        printCombinationOfGivenNumberFromArray(arr, num);
//        printCombinationOfGivenNumberFromArrayusingJava8(Arrays.asList(arr),num);
    }

    public static void printCombinationOfGivenNumberFromArray(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Start j from i + 1 to avoid duplicate pairs
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }

    public static void printCombinationOfGivenNumberFromArrayusingJava8(List<Integer> numbers, int target) {
        numbers.forEach(i ->
                numbers.stream()
                        .filter(j -> !i.equals(j) && i + j == target)
                        .forEach(j -> System.out.println(i + ", " + j))
        );
    }



    public static void printCombination(int arr[], int target){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int compElement=target-arr[i];
            if (set.contains(compElement))
                System.out.println(compElement +" " +arr[i]);
            set.add(arr[i]);

        }
    }
}
