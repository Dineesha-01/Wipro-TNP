import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String firstTwo = str.substring(0, 2);
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            result.append(firstTwo);
        }

        System.out.println(result);

        sc.close();
    }
}
