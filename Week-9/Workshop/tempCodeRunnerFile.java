import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        Arrays.sort(numbers);
        printArray(numbers);

        Integer[] integerNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(integerNumbers, Comparator.reverseOrder());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = integerNumbers[i];
        }
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}