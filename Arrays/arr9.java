import java.util.Arrays;

public class arr9 {
    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2};

        int[] result = new int[arr.length];
        int index = 0;

        // Move all non-10 elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}