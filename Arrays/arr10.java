import java.util.Arrays;

public class arr10 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1, 1};

        int[] result = new int[arr.length];
        int index = 0;

        // First place all even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Then place all odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}