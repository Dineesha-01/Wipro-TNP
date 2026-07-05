public class arr11 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 4};

        boolean isOnly14 = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                isOnly14 = false;
                break;
            }
        }

        System.out.println(isOnly14);
    }
}