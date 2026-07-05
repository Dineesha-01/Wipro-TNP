import java.util.LinkedHashSet;

public class arr7 {
    public static void main(String[] args) {

        int[] arr = {12, 34, 12, 45, 67, 89};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.print("{");
        int i = 0;

        for (int num : set) {
            System.out.print(num);
            if (i != set.size() - 1) {
                System.out.print(", ");
            }
            i++;
        }

        System.out.println("}");
    }
}