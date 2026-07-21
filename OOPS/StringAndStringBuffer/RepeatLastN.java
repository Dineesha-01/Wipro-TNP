import java.util.Scanner;

public class RepeatLastN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < n; i++) {
            result.append(last);
        }

        System.out.println(result);

        sc.close();
    }
}