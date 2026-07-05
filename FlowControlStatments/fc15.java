public class fc15 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (; n > 0; n = n / 10) {
            sum = sum + (n % 10);
        }

        System.out.println(sum);
    }
}