import java.util.Arrays;

public class arr5 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 5, 67};

        Arrays.sort(arr);

        System.out.println("Smallest number: " + arr[0]);
        System.out.println("Second smallest number: " + arr[1]);

        System.out.println("Largest number: " + arr[arr.length - 1]);
        System.out.println("Second largest number: " + arr[arr.length - 2]);
    }
}