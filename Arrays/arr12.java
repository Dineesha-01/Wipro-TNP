import java.util.Arrays;

public class arr12 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // middle elements are at index 1
        int[] result = new int[2];

        result[0] = a[1];
        result[1] = b[1];

        System.out.println(Arrays.toString(result));
    }
}