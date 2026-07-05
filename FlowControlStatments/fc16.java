public class fc16 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int i = 1;
        while (i <= n) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }

            System.out.println();
            i++;
        }
    }
}